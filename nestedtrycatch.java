public class nestedtrycatch {
    public static void main(String[] args){
        try {
            System.out.println("Outer try block");
            try { 
                int a =10 /0; // This will throw ArithmeticException
            }
            catch (ArithmeticException e) {
                System.out.println("Inner catch block: Caught ArithmeticException - " + e);
            }
            String str =null;
            System.err.println("Length of string: " + str.length()); // This will throw NullPointerException
        }
        catch (NullPointerException e) {
            System.out.println("Outer catch block: Caught NullPointerException - " + e);
        }

    }
    
}
