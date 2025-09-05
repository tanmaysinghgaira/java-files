public class Return {
    /*If you want the method to return a value,
     you can use a primitive data type 
     (such as int, char, etc.) instead of void, 
     and use the return keyword inside the method:*/

     static int myMethod(int x){
        return 5 + x;
     }
     public static void main (String []arg){
        System.out.println(myMethod(3));
     }
}
