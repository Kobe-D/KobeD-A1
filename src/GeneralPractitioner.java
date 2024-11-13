// Part - 2 child class(es) 

public class GeneralPractitioner extends HealthProfessional{
    private  String GP; 

    // making child classess
    public GeneralPractitioner(int id, String name, String basicinfo) {
    super(id, name, basicinfo);
    this.GP = GP;

    }   

    //getter for GP
    public String getGP() {
        return GP;
    }
// setter for GP
    public void setGP(String GP) {
        this.GP = GP;
    }

// adjust the print method to include GP




}