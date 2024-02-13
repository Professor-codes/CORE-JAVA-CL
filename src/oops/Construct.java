package oops;

public class Construct {
    // DATA
    // DATA MEMBERS - INSTANCE VARIABLE
    int Id;
    String Name;

    // CONSTRUCTOR
    public Construct(){
        System.out.println("Run Constructor...");
    }

    // BEHAVIOUR
    // MEMBER METHODS - FUNCTIONS
    public void showData(){
        System.out.println("Id : " + Id);
        System.out.println("Name : " + Name);
    }

    // MAIN
    public static void main(String[] args) {
        // OBJECT
        Construct ct = new Construct();

        // OBJECT VARIABLE
        ct.Id = 193260;
        ct.Name = "Nova";

        ct.showData();

    }
}
