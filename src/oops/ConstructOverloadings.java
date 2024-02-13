package oops;

public class ConstructOverloadings {
    // DATA MEMBER
    int Id;
    String Name;
    double Salary;

    // CONSTRUCTOR
    public ConstructOverloadings(int i, String n, double s){
        System.out.println("Run constructor...");
        Id = i;
        Name = n;
        Salary = s;
    }

    // MEMBER METHODS
    public void showdeta(){
        System.out.println("ID : " + Id);
        System.out.println("Name : " + Name);
        System.out.println("Salary : " + Salary);
    }

    // MAIN
    public static void main(String[] args) {
        // OBJECT
        ConstructOverloadings cfs = new ConstructOverloadings(10034, "Osaka", 150000);

        // CALL METHOD
        cfs.showdeta();
    }
}
