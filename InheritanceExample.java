class Employee {
    String name;
    double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String n, double s, String d) {
        super(n, s);  // calling parent class constructor
        department = d;
    }

    void display() {
        super.display(); // call Employee display
        System.out.println("Department: " + department);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Manager m1 = new Manager("Tanmay", 60000, "IT");
        m1.display();
    }
}
