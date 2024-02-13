package oops;

import java.util.Scanner;

public class ConstructOverloading {
    // STATIC SCANNER
    static Scanner sc = new Scanner(System.in);

    // DATA MEMBERS
    String Name;
    int Id;

    // FIRST CONSTRUCTOR
    public ConstructOverloading(){
        System.out.println("Non-Parameterized constructor");
    }

    // SECOND CONSTRUCTOR
    public ConstructOverloading(String Name, int Id){
        System.out.println("Parameterized constructor");
    }

    // MEMBER METHODS
    public void showDet() {
        System.out.println("Name : " + Name);
        System.out.println("Id : " + Id);
    }

    // MAIN
    public static void main(String[] args) {
        // OBJECT
        // FOR NON PARAMETERIZED CONSTRUCTOR
        ConstructOverloading cf = new ConstructOverloading();

        // FOR PARAMETERIZED CONSTRUCTOR
        // ConstructFirst cf = new ConstructFirst("Max", 1048);

        System.out.print("Enter Name : ");
        cf.Name = sc.nextLine();
        System.out.print("Enter Id : ");
        cf.Id = sc.nextInt();

        // METHOD CALL
        cf.showDet();
    }
}
