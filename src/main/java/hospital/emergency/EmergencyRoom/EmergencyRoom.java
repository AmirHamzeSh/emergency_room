package hospital.emergency.EmergencyRoom;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import hospital.emergency.patient.Patient;
import hospital.emergency.patient.SeverityLevel;
import hospital.emergency.patient.Status;
import hospital.emergency.staff.Staff;

//شبیه سازی محیط اورژانس
public class EmergencyRoom {
    private List<Bed> beds;
    private PatientsQueue queue;
    private List<Staff> staffs;
    private List<Patient> patients;

    public EmergencyRoom(int totalBeds) {
        for (int i = 1; i <= totalBeds; i++) {
            beds.add(new Bed(i, "ER-" + i));
        }
    }

    // ثبت بیمار
    public void registerPatient(Patient p) {
        patients.add(p);
        queue.add(p);
        manageQueue();
    }

    //مدیریت صف انتظار
    public void manageQueue() {
        for(Bed b:beds){
            if (b.isEmpty()) {
                Patient p = queue.peek();
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
        
        patients.remove(p);

        for(Bed b : beds){
            if (b.getId() == patientId) {
                b.release();
                break;
            }
        }

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

    //جست و جوی بیمار بر اساس شدت بیماری
    public Patient findPatient(SeverityLevel s) {
        for(Patient p : patients){
            if (p.getSeverityLevel() == s) {
                return p;
            }
        }
        return null ;
    }

    //افزودن پرسنل
    public boolean addStaff(Staff staff){
        return staffs.add(staff);
    }
}

      