// Program to explain exception handling in Java
public class exceptionex {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
        System.out.println("Program continues after exception handling.");
    }
}
