package oops;

interface Shape {
    // VARIABLE - public static final (by default)
    public static final int i = 10;

    // METHOD - public abstract (by default)
    public abstract void display();
}

class Circle implements Shape{
    // METHOD FROM SHAPE
    public void display(){
        System.out.println("Draw a circle...");
    }
}

public class InterfaceShape{
    public static void main(String[] args) {
        // OBJECT
        Circle c = new Circle();
        c.display();
    }
}

