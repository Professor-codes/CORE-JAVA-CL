package oops;

class AnimalInherit {
    String color = "White";

    public void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends AnimalInherit {
    String name = "KuKu";

    public void Behaviour() {
        System.out.println("KuKu is pet...");
    }
}

public class Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.color);
        d.eat();
        d.Behaviour();
    }
}

