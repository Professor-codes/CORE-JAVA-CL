package oops;

public class ThisFunction {
    int Id;
    String Name;

    // FIRST CONSTRUCTOR
    public ThisFunction() {
        // FUNCTION (this)
        this(305, "Jack");
        System.out.println("First constructor");
    }

    // SECOND CONSTRUCTOR
    public ThisFunction(int Id, String Name) {
        System.out.println("Second constructor");
        System.out.println("Id : " + Id);
        System.out.println("Name : " + Name);
    }

    // MAIN
    public static void main(String[] args) {
        // OBJECT
        ThisFunction tf = new ThisFunction();
    }
}
