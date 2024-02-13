package oops;

// BASE CLASS
abstract class Phone {
    // CONCRETE METHOD
    public void btnclick() {
        System.out.println("Phone on...");
    }

    // ABSTRACT METHOD
    abstract public void btnCode();
}

// SUB CLASS
class features extends Phone {
    public void btnCode() {
        System.out.println("This is Code for button");
    }
}

// MAIN
public class Abstract {
    public static void main(String[] args) {
        features f = new features();
        f.btnclick();
        f.btnCode();

//        Phone p = new features();
//        p.btnclick();
//        p.btnCode();
    }
}
