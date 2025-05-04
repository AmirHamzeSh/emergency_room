package hospital.emergency.staff;

//پرستار
public class Nurse extends Staff {
    public Nurse(int id, String name, Shift shift) {
        super(id, name, shift);
        this.role = "Nurse";
    }
}