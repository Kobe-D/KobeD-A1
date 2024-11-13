// Part - 2 child class(es) 

public class GeneralPractitioner extends HealthProfessional{
    private  String gp; 

    // making child classess
    public GeneralPractitioner(int id, String name, String basicinfo) {
    super(id, name, basicinfo);
    this.gp = gp;

    }   

    //getter for GP
    public String getGP() {
        return gp;
    }
// setter for GP
    public void setGP(String gp) {
        this.gp = gp;
    }

// adjust the print method to include GP




}