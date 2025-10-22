package geometricShapeswithDrawables;

// Concrete Classes
class Triangle extends Shape {
    private double side1, side2, side3, height, base;

    public Triangle(double side1, double side2, double side3, double base, double height) {
        super("Triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.base = base;
        this.height = height;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
