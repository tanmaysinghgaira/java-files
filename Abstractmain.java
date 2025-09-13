//JAva program to illustrate
//that an instance of Abstract
//Class can not be created

//Class 1
//Abstract class

abstract  class Base{

    abstract void fun(); 

}

class Derived extends Base{
    void fun(){
        System.out.println("Derived fun () called");
    }
}

public class Abstractmain {
    public static void main(String[] args) {
        //Uncommenting the following line well cause
        //compiler error as the line tries to create an
        //instance of abstract class . base b = new base()

        // We can have reference of base type.

        Base b = new Derived();
        b.fun();

    }
    
}
