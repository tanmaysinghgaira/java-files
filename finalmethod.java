/*When  a method is declared with final keyword ,it is callled a final 
method in java . A final method cannot be overriden.
 * 
 */
 class A{
    final void m1(){
        System.out.println(" this is a final method");
    }
 }
/*  class B extends  A{
    void m1(){
        // Compile-error! We can not override
        System.out.println("Illegal!");
    }
 }*/
public class finalmethod {
    public static void main(String[] args) {
        A a= new A();
        a.m1();
       
    }
}
