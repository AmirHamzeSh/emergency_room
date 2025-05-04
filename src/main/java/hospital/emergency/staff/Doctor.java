package hospital.emergency.staff;

//دکتر
public class Doctor extends Staff {
    public Doctor(int id, String name, Shift shift) {
        super(id, name, shift);
        this.role = "Doctor";
    }
}