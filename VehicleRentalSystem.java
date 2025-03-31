import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Vehicle Interface
interface Vehicle {
    String getMake();
    String getModel();
    int getYear();
    void displayDetails();
}

// CarVehicle Interface
interface CarVehicle extends Vehicle {
    void setNumDoors(int doors);
    int getNumDoors();
    void setFuelType(String fuelType);
    String getFuelType();
}

// MotorVehicle Interface
interface MotorVehicle extends Vehicle {
    void setNumWheels(int wheels);
    int getNumWheels();
    void setMotorcycleType(String type);
    String getMotorcycleType();
}

// TruckVehicle Interface
interface TruckVehicle extends Vehicle {
    void setCargoCapacity(double capacity);
    double getCargoCapacity();
    void setTransmissionType(String transmission);
    String getTransmissionType();
}

// Car Class
class Car implements CarVehicle {
    private String make;
    private String model;
    private int year;
    private int numDoors;
    private String fuelType;

    public Car(String make, String model, int year, int numDoors, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    @Override
    public String getMake() { return make; }
    @Override
    public String getModel() { return model; }
    @Override
    public int getYear() { return year; }
    @Override
    public void setNumDoors(int doors) { this.numDoors = doors; }
    @Override
    public int getNumDoors() { return numDoors; }
    @Override
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }
    @Override
    public String getFuelType() { return fuelType; }

    @Override
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
        System.out.println("Doors: " + numDoors + ", Fuel Type: " + fuelType);
        System.out.println("------------------------");
    }
}

// Motorcycle Class
class Motorcycle implements MotorVehicle {
    private String make;
    private String model;
    private int year;
    private int numWheels;
    private String motorcycleType;

    public Motorcycle(String make, String model, int year, int numWheels, String motorcycleType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numWheels = numWheels;
        this.motorcycleType = motorcycleType;
    }

    @Override
    public String getMake() { return make; }
    @Override
    public String getModel() { return model; }
    @Override
    public int getYear() { return year; }
    @Override
    public void setNumWheels(int wheels) { this.numWheels = wheels; }
    @Override
    public int getNumWheels() { return numWheels; }
    @Override
    public void setMotorcycleType(String type) { this.motorcycleType = type; }
    @Override
    public String getMotorcycleType() { return motorcycleType; }

    @Override
    public void displayDetails() {
        System.out.println("Motorcycle Details:");
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
        System.out.println("Wheels: " + numWheels + ", Type: " + motorcycleType);
        System.out.println("------------------------");
    }
}

// Truck Class
class Truck implements TruckVehicle {
    private String make;
    private String model;
    private int year;
    private double cargoCapacity;
    private String transmissionType;

    public Truck(String make, String model, int year, double cargoCapacity, String transmissionType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.cargoCapacity = cargoCapacity;
        this.transmissionType = transmissionType;
    }

    @Override
    public String getMake() { return make; }
    @Override
    public String getModel() { return model; }
    @Override
    public int getYear() { return year; }
    @Override
    public void setCargoCapacity(double capacity) { this.cargoCapacity = capacity; }
    @Override
    public double getCargoCapacity() { return cargoCapacity; }
    @Override
    public void setTransmissionType(String transmission) { this.transmissionType = transmission; }
    @Override
    public String getTransmissionType() { return transmissionType; }

    @Override
    public void displayDetails() {
        System.out.println("Truck Details:");
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons, Transmission: " + transmissionType);
        System.out.println("------------------------");
    }
}

// Main Program
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        while (true) {
            System.out.println("Choose Vehicle Type to Add:");
            System.out.println("1. Car");
            System.out.println("2. Motorcycle");
            System.out.println("3. Truck");
            System.out.println("4. Show All Vehicles");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) { // Add Car
                System.out.print("Enter Car Make: ");
                String make = scanner.nextLine();
                System.out.print("Enter Car Model: ");
                String model = scanner.nextLine();
                System.out.print("Enter Year of Manufacture: ");
                int year = scanner.nextInt();
                System.out.print("Enter Number of Doors: ");
                int numDoors = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Fuel Type (Petrol/Diesel/Electric): ");
                String fuelType = scanner.nextLine();

                vehicles.add(new Car(make, model, year, numDoors, fuelType));

            } else if (choice == 2) { // Add Motorcycle
                System.out.print("Enter Motorcycle Make: ");
                String make = scanner.nextLine();
                System.out.print("Enter Motorcycle Model: ");
                String model = scanner.nextLine();
                System.out.print("Enter Year of Manufacture: ");
                int year = scanner.nextInt();
                System.out.print("Enter Number of Wheels: ");
                int numWheels = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Motorcycle Type (Sport/Cruiser/Off-road): ");
                String type = scanner.nextLine();

                vehicles.add(new Motorcycle(make, model, year, numWheels, type));

            } else if (choice == 3) { // Add Truck
                System.out.print("Enter Truck Make: ");
                String make = scanner.nextLine();
                System.out.print("Enter Truck Model: ");
                String model = scanner.nextLine();
                System.out.print("Enter Year of Manufacture: ");
                int year = scanner.nextInt();
                System.out.print("Enter Cargo Capacity (tons): ");
                double cargoCapacity = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter Transmission Type (Manual/Automatic): ");
                String transmission = scanner.nextLine();

                vehicles.add(new Truck(make, model, year, cargoCapacity, transmission));

            } else if (choice == 4) { // Show all vehicles
                System.out.println("\nAll Vehicles in the System:");
                for (Vehicle vehicle : vehicles) {
                    vehicle.displayDetails();
                }
            } else if (choice == 5) { // Exit
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

