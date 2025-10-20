package vehicleRentalSystem;

public class Vehicle {
    private String make;
    private String model;
    private double rentalPrice;
    private boolean isAvailable;

    public Vehicle(String make, String model, double rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.isAvailable = true;
    }

    //getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    //setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void rent() {
        System.out.println("Renting " + make);
        this.isAvailable = false;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Price per day: " + rentalPrice);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("isRented: " + (!isAvailable ? "Yes" : "No"));
    }
}
