package core_Java.animals;

interface Shape {
    public static final int COUNT = 3;
    void draw();
    void area();
}
class Circle implements Shape {
    private double r = 7.0;
    private double PI = 3.14;
    @Override
    public void draw() {
        System.out.println("drawing circle..");
    }
    @Override
    public void area() {
        System.out.println("Area of circle: "+ (PI*r*r));
    }
}
class Rectangle implements Shape {
    private double length = 10.0;
    private double breadth = 15.0;
    @Override
    public void draw() {
        System.out.println("drawing rectangle..");
    }
    @Override
    public void area() {
        System.out.println("Area of Rectangle: "+ (length*breadth));
    }
}
class Triangle implements Shape {
    private double base = 30;
    private double height = 15;
    public void draw() {
        System.out.println("drawing triangle..");
    }
    public void area() {
        System.out.println("Area of Triangle: "+ (0.5*base*height));
    }
}

public class Main {
    public static void main(String []args) {
        Shape shape;    //reference of type Shape

        //circle
        shape = new Circle();   //refers to Circle object
        shape.draw();
        shape.area();
        System.out.println();

        //rectangle
        shape = new Rectangle();    //refers to Rectangle object
        shape.draw();
        shape.area();
        System.out.println();

        //triangle
        shape = new Triangle();     //refers to Triangle object
        shape.draw();
        shape.area();
        System.out.println();

        System.out.println("Total shapes: "+ Shape.COUNT);
    }
}
