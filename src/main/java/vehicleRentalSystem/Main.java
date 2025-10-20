package vehicleRentalSystem;

public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        Vehicle car1=new Car("Car1","model1",1000,"NH37373");
        Vehicle car2=new Car("Car2","model2",1900,"LH3773");
        Vehicle bike1=new Bike("bik2","model3",10,false);
        Vehicle bike2=new Bike("bik3","model4",30,true);

        agency.addVehicle(car1);
        agency.addVehicle(car2);
        agency.addVehicle(bike1);
        agency.addVehicle(bike2);

        agency.displayAvailableVehicles();
        agency.displayRentedVehicles();

        agency.rentVehicle();

        System.out.println("After Vehicle Rental");

        agency.displayAvailableVehicles();
        agency.displayRentedVehicles();


    }
}
