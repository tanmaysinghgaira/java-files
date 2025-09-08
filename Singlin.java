class Vehicle{
     Vehicle(){
         System.out.println("THIS IS A VEHICLE");
     }
}
class Car extends Vehicle{
    Car(){
        System.out.println("THIS IS A CAR");
    }
}


public class Singlin{
    public static void main(String[] args) {
         Car C = new Car();
    }


}
//java program to demonstrate single inheritance
/*In single inheritance, a class inherits theproperties of another class.*/