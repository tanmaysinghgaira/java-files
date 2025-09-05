
import java.util.*;

public class Marks {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
    System.out.println("Enter  the Marks of English");
    int a=  sc.nextInt();
    System.out.println("Enter the marks of mathe");
    int b= sc.nextInt();
    System.out.println("enter the marks of hindi");
    int c= sc.nextInt();
  double sum=a+b+c;
double total = sum/500;
     double p =total*100;
     System.out.println("pesentage of student is ");
     System.out .println(p);

    }
}
