//creat a main class
public class Constructor {
    
    int x; //Creat a class attribute

    //Creste a class constructor for the main class
     public  Constructor(){

        x=5;    //Set the initail value for the class attribute

     }
     public static void main(String[] args) {
       Constructor m= new Constructor();//Create an object of class main (This will call the constructor)
         System.out.println(m.x);//print the value of x

     }
}
/*A constructor in Java is a special method that is used to initialize objects.

The constructor is called when an object of a class is created. */