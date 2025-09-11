/* A lower data type is transformed into a higher one by a process
known as widening type casting. Implicit type casting and casting down
are some names for it. It occurs naturally. Since there is no chance of
data loss, it is secure.
Widening Type casting occurs when:*/

public class Typecasting {
    public static void main(String arg[]){
        int i=10;
        //wideing typeCasting (Automatic casting)
        //from int to double

        long l = i;
        //wideng typeCasting  (Automatic casting)
        //from int to double

        double d=i;
        

            System.out.println("INeger" + i);
            
            System.out.println("INeger" + l);
            
            System.out.println("INeger" + d);
    }
}
