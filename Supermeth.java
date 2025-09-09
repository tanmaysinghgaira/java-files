class Person{

    Person(){

        System.out.println("PERSON CLASS CONSTEUCTOR");
    }
}

//subclass student extendin the person class


class Student extends Person{
    Student(){

        //invoke or call parent class constructor

        super();

        System.out.println("Student class Constructor");

    }
}
//Driver Program
public class Supermeth {
    public static void main(String[] args) {
        Student s = new Student ();
    }
    
}
