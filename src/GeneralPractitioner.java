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

// adjust the print method to include GP


@Override  // due to a reamining error and confusion i did ask chatgpt for a fix for this error and this was recommend, more comments will be made in the repository// 

public void printDetails() {    
    System.out.print("Information for the GneralPractitioner:");
    System.out.print("specialised = " + specialised);
}


}