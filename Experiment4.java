//program four
abstract class Shape {
    // Abstract method to print area
    public abstract void printArea();
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    int length, breadth;
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public void printArea() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    int base, height;
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

// Circle class extending Shape
class Circle extends Shape {
    int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public void printArea() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

// Main class
 class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle(5, 10), new Triangle(4, 8), new Circle(6)};

        // Loop through each shape and print area
        for (Shape shape : shapes) {
            shape.printArea();
        }
    }
}
