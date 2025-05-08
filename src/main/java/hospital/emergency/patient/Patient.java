package hospital.emergency.patient;

//بیمار
public class Patient {
    private int id;
    private String name;
    private int age;
    private SeverityLevel severityLevel;
    private Status status;
    private MedicalRecord mRecord;

    public Patient(int id, String name, int age, SeverityLevel severityLevel , boolean needBed) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.severityLevel = severityLevel;
        this.status = Status.REGISTERED;
        this.mRecord = new MedicalRecord(id);
    }

    public String getinfo() {
        String text = "";
        text += ("patient: " + name + ", age: " + age + ", severity: " + severityLevel + "\n");
        text += mRecord.viewRecords();
        return text;
    }

    public void updateStatus(Status newStatus) {
        System.out.println("Updating status of " + name + " from " + status + " to " + newStatus);
        this.status = newStatus;
        System.out.println("status updated.");

    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public SeverityLevel getSeverityLevel() { return severityLevel; }
    public Status getStatus() { return status; }
    public MedicalRecord getMedicalRecord() { return mRecord; }
}
