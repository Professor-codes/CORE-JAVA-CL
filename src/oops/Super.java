package oops;

class First{
    int val = 20;

    public void printFirst(){
        System.out.println("Printing value...");
    }
}

class Second extends First{
    int val = 40;

    public void printSecond(){
        System.out.println("Value of first : " + super.val);
        System.out.println("Value of second : " + val);
    }
}

public class Super {
    public static void main(String[] args) {
        First f = new First();
        f.printFirst();
        Second s = new Second();
        s.printSecond();
    }
}
