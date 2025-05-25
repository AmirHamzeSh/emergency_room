package hospital.emergency.EmergencyRoom;

import hospital.emergency.patient.Patient;
import java.util.ArrayList;
import java.util.List;

public class BedsManage {
    private List<Bed> beds; //       لیست تخت های اوژانس

    BedsManage(int bedsCount){
        beds = new ArrayList<>();
        for (int i = 1; i <= bedsCount; i++) {
            beds.add(new Bed());
        }
    }
    
    public boolean addBed(){
        beds.add(new Bed());
        return true;
    }
    
    public boolean releaseBed(int id){
        for(Bed b : beds){
            if (b.getId() == id) {
                b.release();
                return true;
            }
        }
        return false;        
    }
    
    public Bed getEmptyBed(){
        for(Bed b :beds){
            if(b.isEmpty()){
                return b;
            }
        }
        return null;
    }
    
    public Bed findBed(int id){
        for(Bed b : beds){
            if(b.getId() == id){
                return b;
            }
        }
        return null;
    }
    
    
     public Bed findBed(Patient p){
        for(Bed b : beds){
            if(b.getAssignedPatient() == p){
                return b;
            }
        }
        return null;
    }
    
    public boolean assignBedToPatient(Bed b , Patient p){
        return b.assignToPatient(p);
    }

    public List<Bed> getBeds() {
        return beds;
    }
    
}
