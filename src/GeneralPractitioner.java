// Part - 2 child class(es) 

public class GeneralPractitioner extends HealthProfessional{
    private  String specialised; 

    // making child classess
    public GeneralPractitioner(int id, String name, String basicinfo, String specialised) {
    super(id, name, basicinfo);
    this.specialised = specialised;

    }   

    //getter for GP
public String getSpecialised() {
    return specialised;
    }
// setter for GP
public void setSpecialised(String specialised) {
    this.specialised = specialised;
    }

// adjust the println method to include GP


@Override  // due to a reamining error and confusion i did ask chatgpt for a fix for this error and this was recommend, more comments will be made in the repository// 

public void printlnDetails() {    
    System.out.println("Doctor name: " + getName() );
    System.out.println("Doctor ID " + getId());
    System.out.println("Information for the GeneralPractitiner:" + getBasicinfo());
    System.out.println("specialised = " + getSpecialised());
    // adding a line to seperate information to not get cludder 
    System.out.println("------------------------------");
    }

}