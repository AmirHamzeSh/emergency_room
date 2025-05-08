package hospital.emergency;
import hospital.emergency.EmergencyRoom.EmergencyRoom;
import hospital.emergency.patient.Patient;
import hospital.emergency.patient.SeverityLevel;
import hospital.emergency.staff.Doctor;
import hospital.emergency.staff.Nurse;
import hospital.emergency.staff.Shift;


public class App 
{
    static EmergencyRoom room = new EmergencyRoom(2);
    public static void main( String[] args )
    {
        
        room.staffs.add(new Doctor(1, "ahmad ahmadi", Shift.MORNING));
        room.staffs.add(new Nurse(2, "reza heydari", Shift.AFTERNOON));

        Patient p1 = new Patient(101, "amir", 30, SeverityLevel.HIGH ,true);
        Patient p2 = new Patient(102, "ali", 45, SeverityLevel.LOW , false);

        p1.getMedicalRecord().addEntry("ali is patient");
        
        System.out.println(p1.getinfo());
        System.out.println(p2.getinfo());
        
        room.findPatient(102);
    }
}
