// Abstract class: Vehicle
abstract class Vehicle {
    // Abstract method (no body)
    abstract void start();

    // Concrete method
    void fuelType() {
        System.out.println("Most vehicles use petrol or diesel.");
    }
}

// Concrete class: Bike
class Bike extends Vehicle {
    // Implementing the abstract method
    @Override
    void start() {
        System.out.println("Bike starts with a kick or button.");
    }
}

// Main class to test abstraction
public class abstraction {
    public static void main(String[] args) {
        Vehicle myBike = new Bike();  // Upcasting
        myBike.start();               // Calls overridden method
        myBike.fuelType();            // Calls concrete method from abstract class
    }
}