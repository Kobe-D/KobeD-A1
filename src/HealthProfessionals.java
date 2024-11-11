public class HealthProfessionals { 
    // add my variables 
       private int id;
       private String name;
       private String basicinfo;
   
   
   // default constructor for variables 
   
       public HealthProfessionals(int id, String name, String basicinfo) {
   // initialize the variables
           this.id = 0;
           this.name = "";
           this.basicinfo = "";
   
       }   
   
   }
   // implementing way to obtain client information
   
   public int getId() {
       return id;
   
   }
   
   public String getName() {
       return name;
   }
   
   public String getBasicinfo() {
       return basicinfo;
   }