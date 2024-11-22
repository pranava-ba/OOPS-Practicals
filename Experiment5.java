//program five
interface ShapeTwo {
    void printArea();
}

class RectangleTwo implements ShapeTwo {
    private int length, breadth;
    public RectangleTwo(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void printArea() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

class TriangleTwo implements ShapeTwo {
    private int base, height;
    public TriangleTwo(int base, int height) {
        this.base = base;
        this.height = height;
    }
    public void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

class CircleTwo implements ShapeTwo {
    private int radius;
    public CircleTwo(int radius) {
        this.radius = radius;
    }
    public void printArea() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

 class ShapeMainTwo {
    public static void main(String[] args) {
        ShapeTwo[] shapes = { new RectangleTwo(5, 10), new TriangleTwo(4, 8), new CircleTwo(6) };
        for (ShapeTwo shape : shapes) {
            shape.printArea();
        }
    }
}
