package oops;

// PARENT CLASS
class Vehicles {
    // CONSTRUCTOR
    public Vehicles() {
        System.out.println("This is vehicle class");
    }
}

// CHILD CLASS
class Car extends Vehicles {
    // CONSTRUCTOR
    public Car() {
        // CALL CONSTRUCTOR USING SUPER()
        super();
        System.out.println("This is car class");
    }
}

// MAIN
public class CallConstructor {
    public static void main(String[] args) {
        // OBJECT
        Car obj = new Car();
    }
}


