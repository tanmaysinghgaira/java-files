/* An interface in Java is a blueprint of a class that 
contains abstract methods (methods without a body) and
 constants (variables that are public, static, and final 
 by default). It is used to achieve abstraction and multiple
 inheritance in Java.*/
 import java.util.*;
 
 interface  client{
    void display();
    void output();
 }
 class server implements client{
    public void display(){
        System.out.println("This is display method");
    }
    public void output(){
        System.out.println("This is output method");
    }
    class Interface{
    public static void main(String[] args) {
        server obj = new server();
        obj.display();
        obj.output();
    }}}

