package hospital.emergency.EmergencyRoom;

import hospital.emergency.patient.Patient;
import java.util.LinkedList;
import java.util.List;

public class PatientsQueue {
    final private LinkedList<Patient> queueCritical;
    final private LinkedList<Patient> queueHigh;
    final private LinkedList<Patient> queueMedium;
    final private LinkedList<Patient> queueLow;

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
    
    public boolean remove(Patient p) {
        switch (p.getSeverityLevel()) {
            case CRITICAL:
                return queueCritical.remove(p);
            case HIGH:
                return queueHigh.remove(p);
            case MEDIUM:
                return queueMedium.remove(p);
            case LOW:
            case NULL:
                return queueLow.remove(p);
            default:
                return false;
        }
    }
    
    public Patient findById(int id) {
        for (Patient p : queueCritical) {
            if (p.getId() == id) return p;
        }
        for (Patient p : queueHigh) {
            if (p.getId() == id) return p;
        }
        for (Patient p : queueMedium) {
            if (p.getId() == id) return p;
        }
        for (Patient p : queueLow) {
            if (p.getId() == id) return p;
        }
        return null;
    }


}