// This class demonstrates fundamental concepts of Java programming
public class JavaFundamentals {
    // Instance variables (attributes)
    private String name;
    private int age;

    // Static (class) variable - shared by all instances
    private static int instanceCount = 0;

    // 1. Constructor - special method to initialize objects
    public JavaFundamentals(String name, int age) {
        this.name = name;  // 'this' refers to the current instance
        this.age = age;
        instanceCount++;   // Increment counter when object is created
    }

    // 2. Static method (belongs to class, not instances)
    public static int getInstanceCount() {
        return instanceCount;
    }

    // 3. Main method - entry point of the program
    public static void main(String[] args) {
        // Introduction to Java
        System.out.println("Java Fundamentals Tutorial");
        System.out.println("=========================\n");
        
        // Object-Oriented Programming (OOP) Concepts:
        /* 
         * 1. Encapsulation: Bundling data and methods that operate on that data
         * 2. Inheritance: Creating new classes based on existing ones
         * 3. Polymorphism: Same interface, different implementations
         * 4. Abstraction: Hiding complex implementation details
         */

        // 3. What are the basic data types in Java?
        byte byteNum = 127;         // 8-bit integer
        short shortNum = 32767;     // 16-bit integer
        int intNum = 2147483647;    // 32-bit integer
        long longNum = 9223372036854775807L; // 64-bit integer
        float floatNum = 3.14f;     // 32-bit floating point
        double doubleNum = 3.14159; // 64-bit floating point
        char character = 'A';       // 16-bit Unicode character
        boolean flag = true;        // true or false

        // 4. What is type casting in Java?
        int x = 10;
        double y = (double) x;    // Explicit casting
        int z = (int) 10.99;     // Explicit casting with data loss

        // 5. What are the different types of operators?
        // Arithmetic operators
        int sum = 10 + 5;        // Addition
        int difference = 10 - 5;  // Subtraction
        int product = 10 * 5;     // Multiplication
        int quotient = 10 / 5;    // Division
        int remainder = 10 % 3;   // Modulus

        // 6. What are control statements?
        // If-else statement
        int age = 18;
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        // For loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Iteration " + i);
        }

        // While loop
        int counter = 0;
        while (counter < 3) {
            System.out.println("Counter: " + counter);
            counter++;
        }

        // 7. What is an array?
        int[] numbers = {1, 2, 3, 4, 5};
        String[] fruits = {"Apple", "Banana", "Orange"};

        // 8. What is a method?
        displayMessage("Hello, Java!");
        int result = add(5, 3);
        System.out.println("5 + 3 = " + result);
    }

    // Method with return type
    public static int add(int a, int b) {
        return a + b;
    }

    // Method without return type (void)
    public static void displayMessage(String message) {
        System.out.println(message);
    }

    // 9. What is the difference between == and .equals()?
    public static void compareStrings() {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        
        System.out.println(str1 == str2);        // false (compares references)
        System.out.println(str1.equals(str2));   // true (compares content)
    }

    // 10. What is exception handling?
    public static void demonstrateExceptionHandling() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[10]); // This will throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        } finally {
            System.out.println("This block always executes");
        }
    }
}