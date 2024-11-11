public class HealthProfessionals { 
    // Variables
    private int id;
    private String name;
    private String basicinfo;

    // Constructor
    public HealthProfessionals(int id, String name, String basicinfo) {
    // Initialize the variables using the parameters
        this.id = id;
        this.name = name;
        this.basicinfo = basicinfo;
    }   


// add a way to get this information from clients 

public int getId(){
    return id;
}
public String getName(){
    return name;
}
public String getBasicinfo(){
    return basicinfo;
}


// methods to manipulate the properties 


public boolean setId(int id) {
    if ((id > 0) && (id < 500)) {
        this.id = id;
} else {
    return false;
}
return true;    
    }



}





