package hospital.emergency.EmergencyRoom;

import hospital.emergency.patient.Patient;
//تخت
public class Bed {
    private final int id;
    private static int idCounter=100;
    private boolean isEmpty = true;
    private Patient assignedPatient;

    public Bed() {
        this.id = idCounter;
        idCounter++;
        
    }
    //اختصاص تخت به بیمار
    public boolean assignToPatient(Patient p) {
        if (isEmpty) {
            assignedPatient = p;
            isEmpty = false;
            return true;
        }
        return false;
    }
    //ترخیص بیمار از تخت
    public boolean release() {
        assignedPatient = null;
        isEmpty = true;
        return true;
    }

    public boolean isEmpty() { return isEmpty; }
    public int getId() { return this.id; }
    public Patient getAssignedPatient() { return assignedPatient; }
}