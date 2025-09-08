class Vehicle{
        Vehicle(){
            System.out.println("THIS IS A VEHICLE");
        }
}
class Fourwheeler extends Vehicle{
    Fourwheeler(){
        System.out.println("THIS IS A FOUR WHEEELER");
    }
}
class Car extends Fourwheeler{
    Car(){
        System.out.println("THIS IS A CAR");
    }
}

public class Multilevel {
     public static void main(String[] arg){
            Car C = new Car();
     }
}
//java program to demonstrate multilevel inheritance
/*In multilevel inheritance, a class inherits from a class,
