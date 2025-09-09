class Vehicle {
    int maxSpeed = 120;
     
}
class Car extends Vehicle {
    int maxSpeed =180;
      void display(){
         
        // print maxspeed from the  vehicle class
       
        // using super

        System.out.println("Max Speed " + super.maxSpeed);
      }

}
// Driver program

public class Super {
    public static void main(String[] args) {
        Car small = new Car();
        small.display();
    }
}
// Use of super with Variables