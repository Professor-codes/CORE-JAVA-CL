package oops;

public class Student {
    // DATA
    // DATA MEMBERS - INSTANCE VARIABLE
    int studentId;
    String studentName;
    String studentCity;

    // BEHAVIOUR
    // MEMBER METHODS - FUNCTIONS
    public void showDetails() {
        System.out.println("Id : " + studentId);
        System.out.println("Name : " + studentName);
        System.out.println("City : " + studentCity);
    }
}
