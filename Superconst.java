//superclass person
class Person{
    void message(){
        System.out.println("THIS IS PERSON  \n");
    }
}
 // Subclass Student

class Student extends  Person{
    void message(){

        System.out.println("THIS IS STUDENT CLASS");
    }

    //note that display()is
    // only in student class
    void display(){
        // will invoke or call current
        // class message()method


        message();
        //will invoke or call current
        //class message()method

        super.message();
    }
}
//Driver Program
public class Superconst {
    public static void main(String[] args) {

    Student s= new Student();
    s.display();
    }
}
//Use of super with Methods
/*This is used when we want to call the parent class method. So, 
whenever a parent and child class have the same-named methods then to
 resolve ambiguity we use the super keyword. */