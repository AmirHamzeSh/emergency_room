package hospital.emergency.EmergencyRoom;

import hospital.emergency.patient.Patient;
import java.util.LinkedList;

// ایجاد صف بیماران بر اساس الویت
public class PatientsQueue {
    private LinkedList<Patient> queueCritical;
    private LinkedList<Patient> queueHigh;
    private LinkedList<Patient> queueMEDIUM;
    private LinkedList<Patient> queueLow;

    public void add(Patient p) {
        switch (p.getSeverityLevel()) {
            case CRITICAL:
                queueCritical.add(p);
                break;
            case HIGH:
                queueHigh.add(p);
                break;
            case MEDIUM:
                queueMEDIUM.add(p);
                break;
            case LOW:
                queueLow.add(p);
                break;
        }
    }

    public Patient peek() {
        if (!queueCritical.isEmpty()) {
            return queueCritical.peek();
        } else if (!queueHigh.isEmpty()) {
            return queueHigh.peek();
        } else if (!queueMEDIUM.isEmpty()) {
            return queueMEDIUM.peek();
        } else {
            return queueLow.peek();
        }
    }

    public Patient poll() {
        if (!queueCritical.isEmpty()) {
            return queueCritical.poll();
        } else if (!queueHigh.isEmpty()) {
            return queueHigh.poll();
        } else if (!queueMEDIUM.isEmpty()) {
            return queueMEDIUM.poll();
        } else {
            return queueLow.poll();
        }
    }
    
}
