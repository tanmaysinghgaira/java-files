/*An abstract method in Java is a method that is declared 
without an implementation. It serves as a blueprint for subclasses, 
which are required to provide their own implementation of the method. 
Abstract methods are used to achieve abstraction, allowing developers to define 
behaviors that must be implemented by derived classes.

Key Points: */
// Abstract class
abstract class Animal {
    // Abstract method
    abstract void makeSound();

    // Concrete method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass providing implementation for the abstract method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Abstractmeth {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polymorphism
        myDog.makeSound();       // Output: Bark
        myDog.eat();             // Output: This animal eats food.
    }
}
