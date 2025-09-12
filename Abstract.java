/*In Java, abstract class is declared with the abstract keyword. 
It may have both abstract and non-abstract methods(methods with bodies). 
An abstract is a Java modifier applicable for classes and methods in Java
 but not for Variables. In this article, 
we will learn the use of abstract classes in Java. */
abstract class Sunstar{
    abstract  void printinfo();
}
//Abstraction performed using extends

class Employee extends  Sunstar{
    void printinfo(){
        String name="TRADER";
        int income=10000000;
        float revenu=222.f;
         System.out.println(name);
         System.out.println(income);
         System.out.println(revenu);

    }
}
public class Abstract {
    public static void main(String[] args) {
        Sunstar s= new Employee();
        s.printinfo();
    }
}
