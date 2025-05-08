package hospital.emergency.patient;

import java.util.ArrayList;
import java.util.List;
//پرونده پزشکی       دستورات درمانی
public class MedicalRecord {
    private int patientId;
    private List<String> entries;

    public MedicalRecord(int patientId) {
        this.patientId = patientId;
        this.entries = new ArrayList<>();
    }

    public boolean addEntry(String entry) {
        return entries.add(entry);
    }

    public String viewRecords() {
        String text = "";
        if (!entries.isEmpty()) {
            text += ("Medical records for patientId " + patientId + ":");
            for (String e : entries) {
                text += (" - " + e + "\n");
            }
        }
        return text;

    }

    public int getPatientId() { return patientId; }
}