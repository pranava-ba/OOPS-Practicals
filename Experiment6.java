
interface ShapeThree {
    void printArea();
}

class InvalidDimensionException extends Exception {
    public InvalidDimensionException(String message) {
        super(message);
    }
}

class RectangleThree implements ShapeThree {
    private int length, breadth;

    public RectangleThree(int length, int breadth) throws InvalidDimensionException {
        if (length <= 0 || breadth <= 0) {
            throw new InvalidDimensionException("Invalid dimensions for RectangleThree.");
        }
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void printArea() {
        System.out.println("Area of RectangleThree: " + (length * breadth));
    }
}

class TriangleThree implements ShapeThree {
    private int base, height;

    public TriangleThree(int base, int height) throws InvalidDimensionException {
        if (base <= 0 || height <= 0) {
            throw new InvalidDimensionException("Invalid dimensions for TriangleThree.");
        }
        this.base = base;
        this.height = height;
    }

    @Override
    public void printArea() {
        System.out.println("Area of TriangleThree: " + (0.5 * base * height));
    }
}

class CircleThree implements ShapeThree {
    private int radius;

    public CircleThree(int radius) throws InvalidDimensionException {
        if (radius <= 0) {
            throw new InvalidDimensionException("Invalid radius for CircleThree.");
        }
        this.radius = radius;
    }

    @Override
    public void printArea() {
        System.out.println("Area of CircleThree: " + (Math.PI * radius * radius));
    }
}

 class ShapeMainThree {
    public static void main(String[] args) {
        try {
            ShapeThree rectangle = new RectangleThree(5, 10);
            ShapeThree triangle = new TriangleThree(4, 8);
            ShapeThree circle = new CircleThree(6);

            rectangle.printArea();
            triangle.printArea();
            circle.printArea();

            // Testing invalid dimensions
            ShapeThree invalidRectangle = new RectangleThree(-1, 5);
        } catch (InvalidDimensionException e) {
            System.out.println(e.getMessage());
        }
    }
}
