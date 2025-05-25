package hospital.emergency.staff;

//پرسنل
public class Staff {
    int id;
    String name;
    String role = "Staff";
    Shift shift;

    public Staff(int id, String name,String role, Shift shift) {
        this.id = id;
        this.name = name;
        this.shift = shift;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public Shift getShift() {
        return shift;
    }
    
}