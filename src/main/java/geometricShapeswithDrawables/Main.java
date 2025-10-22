package geometricShapeswithDrawables;


public class Main {
    public static void main(String[] args) {
        DrawingBoard board = new DrawingBoard();

        board.addShape(new Triangle(3, 4, 5, 3, 4)); // sides, base, height
        board.addShape(new Square(5));
        board.addShape(new Triangle(3, 4, 5, 3, 4));
        board.addShape(new Square(5));

        board.displayShapes();
    }
}
