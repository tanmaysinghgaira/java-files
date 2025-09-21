
    // Declaring an interface
interface Animal {
    void eat(); // Abstract method
    void sleep(); // Abstract method
}

// Implementing the interface
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats bones.");
    }

    public void sleep() {
        System.out.println("Dog sleeps in a kennel.");
    }
}

public class Interfacenew {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
    }
}

