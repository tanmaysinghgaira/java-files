public class Sume {
    public static void main(String[] args) {
        //check if exactlt two argument are provided
        // args is the string array that holds command line argument
        if (args.length !=2){
            System.out.println("Error :please provide  exactly two integer ");
            return;
        }
        try {
            //convert the string argument to integers
            int num1 = 4;
            int num2 =3;

            // Calucate the sum
            int sum = num1 +num2;

            System.out.println("the sum of "+ num1+"and"+ num2+"is"+sum);
        } catch ( NumberFormatException e) {
            //this cathc block run if both argument must be valid integer
            System.out.println("Errror Both argument must be valid integers");
        }
    }
}
