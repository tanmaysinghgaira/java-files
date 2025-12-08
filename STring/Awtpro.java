public class Awtpro {
    // awt is java's Abstract Windowing Toolkit it provides a set of APIs to create GUI applications in Java.
    // AWT provides a collection of classes for creating and managing windows, buttons, text fields, labels, and other graphical components.
//commonly used AWT components
    // Frame: A top-level window with a title and a border.
    // Button: A clickable button that can trigger actions when pressed.
    // Label: A non-editable text component used to display information.
    // TextField: An editable text component that allows users to input text.
    // TextArea: A multi-line text component for displaying or editing larger amounts of text.
    // Checkbox: A component that represents a binary choice (checked or unchecked).
    // RadioButton: A component that allows users to select one option from a group of choices.
    // List: A component that displays a list of items from which users can select one or more.
    // MenuBar, Menu, MenuItem: Components for creating menus in a window.
    // Canvas: A blank rectangular area where custom graphics can be drawn.
    // Panel: A container that can hold and organize other AWT components.
    // Scrollbar: A component that allows users to scroll through content that is too large to fit in the visible area.
    // Dialog: A pop-up window that can be used to display messages or gather input from users.
    // FileDialog: A dialog window that allows users to select files for opening or saving.
    // GridBagLayout: A flexible layout manager that arranges components in a grid-like structure with varying sizes and alignments.
    // FlowLayout: A simple layout manager that arranges components in a left-to-right flow, wrapping to the next line as needed.
    // BorderLayout: A layout manager that divides the container into five regions (north, south, east, west, and center) for placing components.
    // CardLayout: A layout manager that allows multiple components to share the same display space, with only one visible at a time.
    public static void main(String[] args) {
        // AWT components are used to create graphical user interfaces (GUIs) in Java applications.
        // They provide a way to interact with users through buttons, text fields, labels, and other visual elements.
        // AWT components are part of the java.awt package and can be used to build desktop applications.
        
        // Example usage of AWT components can be found in various Java GUI applications.
        // For instance, a simple calculator application might use buttons for digits and operations,
        // a text field for displaying results, and labels for instructions.
    }
}
//abstration in java
//Abstraction is a fundamental concept in object-oriented programming that focuses on simplifying complex systems by hiding unnecessary details and exposing only the essential features.
//In Java, abstraction is achieved through abstract classes and interfaces.
//Abstract Classes: An abstract class is a class that cannot be instantiated on its own and is meant to be subclassed. It can contain both abstract methods (methods without a body) and concrete methods (methods with a body). Abstract classes are used to provide a common base for related classes while allowing them to implement specific behaviors.
//Interfaces: An interface is a contract that defines a set of methods that a class must implement.
//Interfaces do not contain any implementation details; they only specify method signatures. A class can implement multiple interfaces, allowing for greater flexibility and code reuse.
//Abstraction helps in reducing complexity, improving code maintainability, and enhancing the overall design of software systems by focusing on high-level concepts rather than low-level implementation details.
//Example of Abstraction in Java:
abstract class Animal { 
    abstract void makeSound(); // Abstract method (no implementation)
    void eat() { // Concrete method
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void makeSound() { // Implementing the abstract method
        System.out.println("Woof");
    }
}   
class Cat extends Animal {
    void makeSound() { // Implementing the abstract method
        System.out.println("Meow");
    }
}
class Abstraction       
{
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myDog.makeSound(); // Output: Woof
        myDog.eat();       // Output: This animal eats food.
        
        myCat.makeSound(); // Output: Meow
        myCat.eat();       // Output: This animal eats food.
    }
}
//In this example, the Animal class is abstract and defines an abstract method makeSound() and a concrete method eat().
//The Dog and Cat classes extend the Animal class and provide       specific implementations for the makeSound() method.
//This demonstrates abstraction by allowing us to work with the Animal type without needing to know the specific details of each animal's sound implementation.
