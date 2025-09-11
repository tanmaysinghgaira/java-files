/*The process of downsizing a bigger data type into a smaller one is
 known as narrowing type casting. Casting up or explicit type casting 
 are other names for it. It doesn't just happen by itself. If we don't 
 explicitly do that, a compile-time error will occur. Narrowing type 
 casting is unsafe because data loss might happen due to the lower data
  type's smaller range of permitted values. 
A cast operator assists in the process of explicit casting. */
/*Syntax:

smaller_data_type variable_name = (smaller_data_type) larger_data_type_variable; */
public class TypecastingN {
    public static void main(String []arg){
        double i =100.25;
        //Narrowing Type casting
        short j=(short)i;
        int k =(int)i;

        System.out.println("ORginal Value before Casting "  + i);
        System.out.println("After Type Casting to short "  +  j);
        System.out.println("After Type Casting to int"   +  k);

    }
}
