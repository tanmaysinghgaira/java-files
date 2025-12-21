package STring;



public class stlength {
    public static void main(String[] args) {
        
 
    String name="tanmaysinghgaora";
    System.out.println(name.length());
}
}
//End of file STring/stlength.java
File: STring/TestInheritance.java
//Base class Employee
package STring;
class Employee{
    String name;
    double salary;

    public  Employee (String name, double salary){
        // Counstructor for employee
        this.name =name;
        this.salary = salary;
    }

    //Method to display Emplaoyee details
    public void display(){
        System.out.println("name "+ name);
        System.out.println("Salary "+ salary);

    }
}       //uu