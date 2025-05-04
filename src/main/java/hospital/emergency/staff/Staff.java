package hospital.emergency.staff;

//پرسنل
public abstract class Staff {
    int id;
    String name;
    String role = "Staff";
    Shift shift;

    public Staff(int id, String name, Shift shift) {
        this.id = id;
        this.name = name;
        this.shift = shift;
    }
}