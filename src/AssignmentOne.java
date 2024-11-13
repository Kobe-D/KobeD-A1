public class AssignmentOne {
    public static void main(String[] args) {

    
    
     // Part 3 – Using classes and objects


     GeneralPractitioner gp1 = new GeneralPractitioner(001, "Dr Megan Poppy", "local doctor of 10 years, bulk billing", "Family care");
     GeneralPractitioner gp2 = new GeneralPractitioner(002, "Dr James Rabbit", "Bulk billing", "Elderly Care");
     GeneralPractitioner gp3 = new GeneralPractitioner(003, "Dr Casey Wright", "Specialised in infant new born care for 30 years", "Ifants + newborns");
     GeneralPractitioner gp4 = new GeneralPractitioner(004, "Dr Anna smith", "Specialised in care for for Aboriginal and Torres Strait Islander people ", "Aboriginal and Torres Strait Islander care");


// adding the dermatologist 

    Dermatologist d1 = new Dermatologist(011, "Dr Harry Joghnson", "Graduated for X univeristy with Y degree", "Dermatopathology");
    Dermatologist d2 = new Dermatologist(012, "Dr Dexter Morgan", "Graduated for  Y univeristy with X degree", "Cosmetic dermatology");

// command to actuall print these 
    gp1.printDetails();
    gp2.printDetails();
    gp3.printDetails();
    gp4.printDetails();
    d1.printDetails();
    d2.printDetails();

        System.out.print("====================================");


    }



}
 