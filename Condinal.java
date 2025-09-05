
import java.util.Scanner;

public class Condinal {
    public static void main(String[] args) {
          System.out.println("ENTER the NUmber");
        Scanner Sc = new Scanner(System.in);
        int x=Sc.nextInt();
     
        if (x % 2==0){
            System.out.println("even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
