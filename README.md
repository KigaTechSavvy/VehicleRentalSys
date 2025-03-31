# VehicleRentalSys

Vehicle Rental System Documentation.

The Vehicle Rental System is a Java-based program designed for a car rental agency to manage different vehicle types, including cars, motorcycles, and trucks. 
The program follows an interface-based design to enforce common behavior across different vehicle classes.
Features
   ⦁	Implements interfaces to ensure a common structure for vehicles
   ⦁	Supports three types of vehicles: Car, Motorcycle, and Truck
   ⦁	Allows users to input and store vehicle details
   ⦁	Displays detailed vehicle information
   ⦁	Uses ArrayList to manage multiple vehicle objects
   ⦁	Ensures object-oriented design principles (Encapsulation, Polymorphism)
   ⦁	Includes error handling and user-friendly interactions

System Design
     Interfaces
The system defines four interfaces:
  ⦁	Vehicle (Base Interface) - Defines common vehicle attributes and behavior.
  ⦁	CarVehicle - Extends Vehicle for cars and includes attributes for number of doors and fuel type
  ⦁	MotorVehicle - Extends Vehicle for motorcycles and includes attributes for number of wheels and motorcycle type.
  ⦁	TruckVehicle - Extends Vehicle for trucks and includes attributes for cargo capacity and transmission type.

Class Implementations
Each vehicle type is implemented as a class that implements the relevant interfaces:
    Car Class
⦁	Implements Vehicle and CarVehicle
⦁	Attributes:
🔹 make - Brand of the car
🔹 model - Model name
🔹 year - Year of manufacture
🔹 numDoors - Number of doors
🔹 fuelType - Type of fuel (Petrol, Diesel, Electric)

  Motorcycle Class
⦁	Implements Vehicle and MotorVehicle
⦁	Attributes:
🔹 make - Brand of the motorcycle
🔹 model - Model name
🔹 year - Year of manufacture
🔹 numWheels - Number of wheels
🔹 motorcycleType - Type of motorcycle (Sport, Cruiser, Off-road)

Truck Class
⦁	Implements Vehicle and TruckVehicle
⦁	Attributes:
🔹 make - Brand of the truck
🔹 model - Model name
🔹 year - Year of manufacture
🔹 cargoCapacity - Cargo capacity in tons
🔹 transmissionType - Transmission type (Manual, Automatic)

Main Program (VehicleRentalSystem)
The main method provides an interactive menu-driven approach to allow users to:
⦁	Add Cars, Motorcycles, and Trucks
⦁	Display details of all stored vehicles
⦁	Exit the program

Error Handling
⦁	Handles invalid menu choices
⦁	Prevents incorrect data types (e.g., string instead of int)
⦁	Manages incorrect fuel types, motorcycle types, and transmission types

Future Enhancements
🔹 Database integration to store vehicle details permanently
🔹 Graphical User Interface (GUI) for better user experience
🔹 Add rental price calculation based on vehicle type
🔹 More vehicle types (e.g., Electric Cars, Bicycles, Buses)


