package hospital.emergency.EmergencyRoom;

import hospital.emergency.patient.Patient;
import java.util.ArrayList;
import java.util.List;

public class BedsManage {
    public List<Bed> beds; //       لیست تخت های اوژانس

    BedsManage(int bedsCount){
        beds = new ArrayList<>();
        for (int i = 1; i <= bedsCount; i++) {
            beds.add(new Bed(100+i));
        }
    }
        
        
    public boolean releaseBed(Patient p){
        if (p == null)
            return false;
        
        for(Bed b : beds){
            if (b.getAssignedPatient() == p) {
                b.release();
                break;
            }
        }

        return true;
    }
    
    public Bed getEmptyBed(){
        for(Bed b :beds){
            if(b.isEmpty()){
                return b;
            }
        }
        return null;
    }
    
    public boolean assignBedToPatient(Bed b , Patient p){
        return b.assignToPatient(p);
    }
}
