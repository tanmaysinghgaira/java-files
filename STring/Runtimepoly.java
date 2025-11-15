//super class

abstract class Shape {

    abstract void draw();
}
// subclass

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing A Squre");
    }
}

public class Runtimepoly {

    public static void main(String[] args) {
        Shape s;//Superclass reference

        s = new Circle(); //s holds  Circle objects

        s.draw();  //calls Circle's draw()

        s = new Square();//s holds Square object
        s.draw();  //calls Square's draw()
    }
}
