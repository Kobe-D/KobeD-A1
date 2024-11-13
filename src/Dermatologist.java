// Kobe Donovan 24210524 
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
    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }


// add a method to update println to include specialist

@Override  // due to a reamining error and confusion i did ask chatgpt for a fix for this error and this was recommend, more comments will be made in the repository// 

public void printlnDetails() {    
    System.out.println("Doctor name: " + getName() );
    System.out.println("Doctor ID " + getId());
    System.out.println("Information for the dermatologist specialyst: " + getBasicinfo());
    System.out.println("specalist = " + getSpecialist());
    // adding a line to seperate information to not get cludder 
    System.out.println("------------------------------");

    
}



}

 