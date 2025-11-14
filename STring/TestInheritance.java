class Employee{
    String name;
    double salary;

    public  Employee (String name, doubel salary){
        // Counstructor for employee
        this.name =name;
        this.salary = salary;
    }

    //Method to display Emplaoyee details
    public void display(){
        System.out.println("name"+ name);
        System.out.println("Salary"+ salary);

    }
}
// Derived class student
class manager extends  Employee{
    String department;

    //Counstructor of Manage

    public manager(String name, double salary,String department){

        //call the super class constructor
        super(name,salary);
        this.department= department;

    }

    //Override the display method to add departmetn
    public void display(){
        super.display();
        System.out.println("Department" +department);
    }
}
//Main class to demonstrate inheritance
public class TestInheritance {
    public static void main(String[] args) {
        manager mgr =new manager("ARUN",66666,"Technology");
         
        //call the overriden display method
        System.out.println("Manager Details");
        mgr.display();
    }
}
