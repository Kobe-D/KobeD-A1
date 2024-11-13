// Part 4 – Class Appointment  

//variables
public class Appointment {
    
    private String patientName;
    private String patientMobile;
    private String timeslot;
    private HealthProfessional doctor; 


// constrcutor

    public Appointment() {
        this.patientName = "";
        this.patientMobile = "";
        this.timeslot = "";
        this.doctor = null;

 }

//inistalise the varribles 

    public Appointment(String patientName, String patientMobile, String timeslot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeslot = timeslot;
        this.doctor = doctor;
    
    }

    // getter method for patient Name

    public String getPatientName() {
        return patientName;
    }

    // setter method for patient Name
   
    public void setPatientName(String patientName) {
        this.patientName = patientName;

    }

// getter / setter method for patient mobile 
    public String getPatientMobile(){
        return patientMobile;
    }

    public void setPatientMobile(String patientMobile) {
        this.patientMobile = patientMobile;
    }

// getter / setter method for timeslot 

    public String getTimeslot(){
        return timeslot;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }

// getter / setter method for doctor

    public HealthProfessional getDoctor(){
        return doctor;
    }

    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }


// adding printing method

public void printAppointmentList(){
    System.out.println("Patient Name: " + patientName);
    System.out.println("Patien Mobile: " + patientMobile);
    System.out.println("Specified time slot: " + timeslot);
    System.out.println("Doctor :" + doctor.getName());


}


    }


















}