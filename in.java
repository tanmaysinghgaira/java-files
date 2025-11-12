/*inheritance in java is a core object oriented programming concept that allow one class */
//to acquire the fields and methods of another class it promotes code reusability ,method overriding
//and clear hierachical structure 
class Animal{
    String name;
    
    Animal(String name){
        this.name =name;
    }
    //method
void eat(){
    System.out.println(name +"is eating");
}
}
//child class

class Rat extends  Animal{
    String breed;
    //constructor
    Rat(String name,String breed){
        super(name); //call parent constructor
        this.breed=breed;
        
    }
    void bark(){
        System.out.println(name +"is barking");
    }

}

public class in{
 public static void main(String[] args) {
    try {
        Rat rat = new Rat("BUDDY","HAMESTER");
        rat.eat(); //inherited method
        rat.bark(); //child's own method
    } catch (Exception e) {
        System.out.println("Error "+ e.getMessage());
    }

 }
}
    

