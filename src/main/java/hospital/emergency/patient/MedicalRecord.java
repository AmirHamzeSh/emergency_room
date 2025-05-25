package hospital.emergency.patient;

import java.util.ArrayList;
import java.util.List;
//پرونده پزشکی       دستورات درمانی
public class MedicalRecord {
    private int Id;
    private String value = "";

    public MedicalRecord(int patientId) {
        this.Id = patientId;
        
    }

    public void setValue(String entry) {
        value += entry;
    }

    public int getId() {
        return Id;
    }
    
    public String getValue() {
        return value;
    }
    
}