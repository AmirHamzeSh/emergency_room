package hospital.emergency.EmergencyRoom;

import hospital.emergency.patient.Patient;
import java.util.LinkedList;
import java.util.List;

public class PatientsQueue {
    private LinkedList<Patient> queueCritical;
    private LinkedList<Patient> queueHigh;
    private LinkedList<Patient> queueMedium;
    private LinkedList<Patient> queueLow;

    public PatientsQueue() {
        queueCritical = new LinkedList<>();
        queueHigh = new LinkedList<>();
        queueMedium = new LinkedList<>();
        queueLow = new LinkedList<>();
    }

    public void add(Patient p) {
        switch (p.getSeverityLevel()) {
            case CRITICAL:
                queueCritical.add(p);
                break;
            case HIGH:
                queueHigh.add(p);
                break;
            case MEDIUM:
                queueMedium.add(p);
                break;
            case LOW:
                queueLow.add(p);
                break;
            case NULL:
                queueLow.add(p);
                break;                
        }
    }

    public Patient peek() {
        if (!queueCritical.isEmpty()) {
            return queueCritical.peek();
        } else if (!queueHigh.isEmpty()) {
            return queueHigh.peek();
        } else if (!queueMedium.isEmpty()) {
            return queueMedium.peek();
        } else if (!queueLow.isEmpty()) {
            return queueLow.peek();
        } else {
            return null;
        }
    }

    public Patient poll() {
        if (!queueCritical.isEmpty()) {
            return queueCritical.poll();
        } else if (!queueHigh.isEmpty()) {
            return queueHigh.poll();
        } else if (!queueMedium.isEmpty()) {
            return queueMedium.poll();
        } else if (!queueLow.isEmpty()) {
            return queueLow.poll();
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return queueCritical.isEmpty() && queueHigh.isEmpty() &&
               queueMedium.isEmpty() && queueLow.isEmpty();
    }
    
    
    public List<Patient> getall(){
        List<Patient> allPatients = new LinkedList<>();
        allPatients.addAll(queueCritical);
        allPatients.addAll(queueHigh);
        allPatients.addAll(queueMedium);
        allPatients.addAll(queueLow);
        return allPatients;
    }
}
