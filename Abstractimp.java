// Abstract Class having constructor, data member, and methods
//Below is the implementation of the above topic:
abstract  class Subject {
     Subject(){
        System.out.println("LEARNING SUBJECT");
     }

     abstract void syllabus();

     void Learn(){
         System.out.println("Perpearing Right Now");
     }
}
class It extends Subject{
 void syllabus(){
    System.out.println("C ,JAVA , C++");
 }
}
public class Abstractimp {
    public static void main(String[] args) {
        Subject x= new It();
        x.syllabus();
        x.Learn();
    }
}
