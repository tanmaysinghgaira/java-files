 class Employee {
    
    String  name;
    double salary;
     
    Misam (String n , double s )
    {
        name  =n ;
        salary =s;

    }
    void display(){
        System.out.println("Name  :"+ name);
        System.out.println("salary :"+salary);

    }
}
class Manager extends Employee {
    String department;
    Manager (String n,double s,String d){
        super (n,s );
      //calling parent class constructor
   department=d;

    }
    void display(){
        super.display();
        System.out.println("Department :" + department);
    }
}

class Fundamental {
    public static void main(String[] args) {
        Manager m1 = new Manager("Ali", 700000, "IT");
        m1.display();
    }
}