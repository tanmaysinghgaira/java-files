public class Finallyf {
    /*The finally block is used to execute 
    important code regardless of whether an 
    exception occurs or not.*/
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result =10 /0; // This will throw ArithmeticException
        }
        catch(ArithmeticException e){
            System.out.println("Exception cought : " + e.getMessage());
        }
        finally{
            System.out.println("finally block executed");

        }
        System.out.println("Program continuess.......");
    }
}
