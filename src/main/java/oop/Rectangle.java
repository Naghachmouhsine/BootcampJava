package oop;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    // Display rectangle info
    public void displayInfo() {
        System.out.println("Rectangle length: " + length);
        System.out.println("Rectangle width: " + width);
        System.out.println("Rectangle area: " + calculateArea());
    }
}
