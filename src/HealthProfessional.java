// Part 1 - base clase

public class HealthProfessional { 
    // Variables
    private int id;
    private String name;
    private String basicinfo;

    // Constructor
    public HealthProfessional(int id, String name, String basicinfo) {
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

// methods to manipulate the properties by creating restrictions 
public boolean setId(int id) {
    if ((id > 0) && (id < 500)) {
        this.id = id;
} else {
    return false;
}
return true;    
    }

public boolean setName(String name) {
    if ((name.length() > 3) && (name.length() < 15)) {
        this.name = name;
} else {
    return false;
}
return true;    
    }

public boolean setBasicinfo(String basicinfo) {
    if ((basicinfo.length() > 0) && (basicinfo.length() <100)) {
        this.basicinfo = basicinfo;
} else {
    return false;
}
return true;
    }
// method to println all of the above information 

public void printlnDetails() {
    System.out.println("Id = " + id);
    System.out.println("Name = " + name);
    System.out.println("Basicinfo = " + basicinfo);


}



}









