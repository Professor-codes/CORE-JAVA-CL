package oops;

public class Methodoverloading {
    int Id;
    String Name;

    // FIRST METHOD
    public void showInfo() {
        System.out.println("Id : " + Id);
        System.out.println("Name : " + Name);
    }

    // SECOND METHOD
    public void showInfo(int i, String n) {
        System.out.println("Overload method...");
        System.out.println("Overload Id : " + i);
        System.out.println("Overload Name : " + n);
    }

    // MAIN
    public static void main(String[] args) {
        // OBJECT
        Methodoverloading mo = new Methodoverloading();

        mo.Id = 1404;
        mo.Name = "William";

        // CALL METHODS
        mo.showInfo();
        mo.showInfo(102, "Samoa");
    }
}
