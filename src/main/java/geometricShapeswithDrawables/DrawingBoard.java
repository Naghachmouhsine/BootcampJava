package geometricShapeswithDrawables;

import java.util.ArrayList;
import java.util.List;

class DrawingBoard {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void displayShapes() {
        for (Shape s : shapes) {
            s.displayType();
            s.drawShape();
            System.out.println("Area: " + s.calculateArea());
            System.out.println("Perimeter: " + s.calculatePerimeter());
            System.out.println();
        }
    }
}
