
import java.util.Scanner;

public class Streverse {


public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
System.out.println("Enter a string");
   String originalStr = sc.nextLine();
   String reversedStr ="" ;


   for(int i=0;i<originalStr.length();i++){
    reversedStr =originalStr.charAt(i)+ reversedStr;
   }
   System.out.println("REVERSED STRING " + reversedStr);
}
}

