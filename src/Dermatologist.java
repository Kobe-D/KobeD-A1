// Part - 2 child class(es) 

public class Dermatologist extends HealthProfessional {
    // stating its more then a GP and a specialised heal worker 
    private String specialist;

    //constructor 
    public Dermatologist(int id, String name, String basicinfo, String specialist) {
        // call the parent constructor from Healthprofesonal
        super(id, name, basicinfo);
        this.specialist = specialist;
    }

    //getter
    public String getSpecialist() {
        return specialist;
    }

    //setter 
    public void SetSpecialist(String Specialsist) {
        this.specialist = specialist;
    }

}

// add a method to update print to include specialist 