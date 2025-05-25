package hospital.emergency.patient;

//بیمار
public class Patient {
    private int id;
    private String name;
    private String gen;
    private int age;
    private SeverityLevel severityLevel = SeverityLevel.NULL;
    private Status status;
    private MedicalRecord mRecord;
    public boolean needBed = false;

    public Patient(int id, String name, int age,String gen , boolean needBed) {
        this.id = id;
        this.name = name;
        this.gen = gen;
        this.age = age;
        this.status = Status.REGISTERED;
        this.mRecord = new MedicalRecord(id);
        this.needBed = needBed;
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
    public String getGen() { return gen; }
    public SeverityLevel getSeverityLevel() { return severityLevel; }
    public Status getStatus() { return status; }
    public MedicalRecord getMedicalRecord() { return mRecord; }
    public String[] Exportdata(){
        String[] data = {
            String.valueOf(this.id),
            this.name,
            this.gen,
            String.valueOf(this.age),
            String.valueOf(this.severityLevel),
            String.valueOf(this.status),
        };
        return data;
    }
}
