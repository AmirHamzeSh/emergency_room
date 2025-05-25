package hospital.emergency.patient;

//بیمار

public class Patient {
    private final int id;
    private static int idCounter = 100;
    private final String name;
    private final String family;
    private final String gen;
    private final int age;
    private SeverityLevel severityLevel = SeverityLevel.NULL;
    private Status status;
    public boolean needBed = false;
    private final  MedicalRecord medicalRecord ;
    
    public Patient(String name, String family ,int age,String gen ,SeverityLevel severityLevel, boolean needBed) {
        this.id = idCounter; idCounter++;
        this.name = name;
        this.family = family;
        this.gen = gen;
        this.age = age;
        this.severityLevel = severityLevel;
        this.status = Status.REGISTERED;
        this.needBed = needBed;
        this.medicalRecord = new MedicalRecord(id);
    }

    public boolean updateStatus(Status newStatus) {
        this.status = newStatus;
        return true;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getFamily() {return family;}
    public int getAge() { return age; }
    public String getGen() { return gen; }
    public SeverityLevel getSeverityLevel() { return severityLevel; }
    public Status getStatus() { return status; }
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

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }
    
}
