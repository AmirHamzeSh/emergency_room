package hospital.emergency.EmergencyRoom;

import hospital.emergency.patient.Patient;
//تخت
public class Bed {
    public int id;
    public boolean isEmpty;
    public Patient assignedPatient;

    public Bed(int id) {
        this.id = id;
        this.isEmpty = true;
    }
    //اختصاص تخت به بیمار
    public boolean assignToPatient(Patient p) {
        if (isEmpty) {
            assignedPatient = p;
            isEmpty = false;
            System.out.println("Bed " + id + " assigned to " + p.getName());
            return true;
        }
        return false;
    }
    //ترخیص بیمار از تخت
    public void release() {
            assignedPatient = null;
            isEmpty = true;
            System.out.println("Released bed " + id + " from " + assignedPatient.getName());
        
    }

    public boolean isEmpty() { return isEmpty; }
    public int getId() { return this.id; }
    public Patient getAssignedPatient() { return assignedPatient; }
}