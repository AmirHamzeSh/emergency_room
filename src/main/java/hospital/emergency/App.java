package hospital.emergency;
import hospital.emergency.EmergencyRoom.*;
import hospital.emergency.patient.*;
import hospital.emergency.staff.*;


public class App 
{
    static EmergencyRoom room = new EmergencyRoom(2);
    public static void main( String[] args )
    {
        
        room.addStaff(new Doctor(1, "ahmad ahmadi", Shift.MORNING));
        room.addStaff(new Nurse(2, "reza heydari", Shift.AFTERNOON));

        Patient p1 = new Patient(101, "amir", 30, SeverityLevel.HIGH);
        Patient p2 = new Patient(102, "ali", 45, SeverityLevel.MEDIUM);

        p1.printinfo();
        p2.printinfo();

        room.assignBedToPatient(p1);
        room.assignBedToPatient(p2);

        room.manageQueue();

        room.findPatient(102);
    }
}
