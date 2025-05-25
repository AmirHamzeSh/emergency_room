package hospital.emergency.EmergencyRoom;

import java.util.List;

import hospital.emergency.patient.*;
import hospital.emergency.staff.*;
import java.util.ArrayList;
//شبیه سازی محیط اورژانس
public class EmergencyRoom {
    public static BedsManage bedsMg; // مدیریت تخت ها
    public static PatientsQueue queue; //   لیست بیماران در صف
    public static List<Staff> staffs; //            لیست پرسنل
    public static List<Patient> patients; //  لیست همه بیماران

    public EmergencyRoom(int bedsCount) {
        bedsMg = new BedsManage(bedsCount);
        queue = new PatientsQueue();
        staffs = new ArrayList<>();
        patients = new ArrayList<>();

    }

    // ثبت بیمار
    public void registerPatient(Patient p) {
        patients.add(p);
        queue.add(p);
        manageQueue();
    }

    //اختصاص تخت خالی به بیماران در صف
    public void manageQueue() {
        Bed b = bedsMg.getEmptyBed();
        Patient p = queue.peek();
        if(p.needBed){
            p.updateStatus(Status.ADMITTED);
            queue.poll();
        }
        
        // اگر تخت خالی وجود داشت
        if  (b != null) {
            //اگر صف خالی نبود
            if (p != null){
                b.assignToPatient(p);
                p.updateStatus(Status.ADMITTED);
                queue.poll();
            }
        }
    }

    //ترخیص بیمار
    // TODO پاک کردن بیمار اگر در صف بود
    public boolean releasePatient(int patientId){
        Patient p = findPatient(patientId);
        if (p == null)
            return false;
        p.updateStatus(Status.DISCHARGED);
        bedsMg.releaseBed(p);
        manageQueue();
        return true;
    }


    //جست و جوی بیمار بر اساس ایدی
    public Patient findPatient(int patientId) {
        for(Patient p : patients){
            if (p.getId() == patientId) {
                return p;
            }
        }
        return null ;
    }
}

      