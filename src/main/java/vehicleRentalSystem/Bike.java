package vehicleRentalSystem;

public class Bike extends Vehicle {
    private boolean isElectric;

    public Bike(String make, String model, double rentalPrice, boolean isElectric) {
        super(make, model, rentalPrice);
        this.isElectric = isElectric;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Electric : " + (isElectric ? "Yes" : "No"));
        System.out.println("-----------------------------");
    }
}
