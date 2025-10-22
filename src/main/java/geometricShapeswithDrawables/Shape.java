package geometricShapeswithDrawables;

// Abstract Class
abstract class Shape implements Drawable {
    protected String type;

    public Shape(String type) {
        this.type = type;
    }

    public void displayType() {
        System.out.println("Shape type: " + type);
    }
}
