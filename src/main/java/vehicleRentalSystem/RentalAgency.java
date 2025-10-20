package vehicleRentalSystem;

import java.util.ArrayList;

public class RentalAgency {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
        System.out.println(v.getMake() + " " + v.getModel() + " added to the agency.");
    }

    public void displayAvailableVehicles() {
        System.out.println("\n Available Vehicles:");
        boolean hasAvailable = vehicles.stream()
                .filter(Vehicle::isAvailable)
                .peek(Vehicle::displayInfo)
                .count() > 0;

        if (!hasAvailable) {
            System.out.println("No vehicles are currently available");
        }
    }

    public void displayRentedVehicles() {
        System.out.println("\n Rented Vehicles:");
        boolean hadRented=vehicles.stream()
                .filter(vehicle -> !vehicle.isAvailable())
                .peek(Vehicle::displayInfo)
                 .count() > 0;
        if (!hadRented) {
            System.out.println("No vehicles are currently rented");
        }
    }

    public void rentVehicle() {
       for (Vehicle v : vehicles) {
           if (v.isAvailable()) {
               System.out.println(v.getMake() + " " + v.getModel());
               v.rent();
           }
       }
    }
}
