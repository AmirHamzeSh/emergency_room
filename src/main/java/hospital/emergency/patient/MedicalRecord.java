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

    public void addEntry(String entry) {
        entries.add(entry);
        System.out.println("Added medical entry for " + patientId + ": " + entry);
    }

    public void viewRecords() {

        if (!entries.isEmpty()) {
            System.out.println("Medical records for patientId " + patientId + ":");
            for (String e : entries) {
                System.out.println(" - " + e);
            }
        }

    }

    public int getPatientId() { return patientId; }
}