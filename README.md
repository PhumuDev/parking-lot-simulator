# Parking Lot Simulation

## Description

The Parking Lot Simulation project simulates the behavior of cars arriving at a parking lot, parking for a random amount of time, and then leaving. The simulation takes into account scenarios where the parking lot might be full, and cars have to wait for a parking space to become available.

## Classes

### ParkingLot

The `ParkingLot` class represents the parking lot. It maintains information about the number of available parking spaces, the number of parked cars, and the count of cars waiting for parking. This class provides methods to park a car, make a car leave, signal a car to wait, and signal the end of a car's wait. It also offers methods to retrieve the current number of spaces, parked cars, and waiting cars.

### Simulator

The `Simulator` class contains the `main` method that initiates the parking lot simulation. It creates an instance of the `ParkingLot` and continually generates new instances of the `Car` class in a loop, simulating the arrival of cars at the parking lot.

### Car

The `Car` class represents an individual car arriving at the parking lot. Each car is modeled as a separate thread. This class contains methods to simulate parking, leaving the parking lot, and handling situations where the parking lot is full, causing the car to wait.

## Usage

### 1. Compile the Java files:
javac ParkingLot.java Simulator.java Car.java

### 2. Run the simulation:
java Simulator

The simulation will start, and you'll observe output messages indicating various actions of the cars, such as arrival, parking, waiting, and departure.

## Contributing

Contributions to this simulation project are welcome! If you discover any issues or wish to enhance the simulation, feel free to fork this repository and submit a pull request.








