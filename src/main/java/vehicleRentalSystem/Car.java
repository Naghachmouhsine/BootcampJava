package vehicleRentalSystem;

public class Car extends Vehicle {
    private String registrationNumber;

    public Car(String make, String model, double rentalPrice, String registrationNumber) {
        super(make, model, rentalPrice);
        this.registrationNumber = registrationNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("registration number: " + registrationNumber);
        System.out.println("-----------------------------");
    }
}
