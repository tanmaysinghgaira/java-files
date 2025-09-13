public class SttoArray {
    public static void main(String[] args) {
         String myStr =" Hello" ;

         //Convert the String to a char array
         char[] myArray = myStr.toCharArray();

         //print array elements
        for(char i : myArray){
            System.out.println(i);
        }
        }
}
