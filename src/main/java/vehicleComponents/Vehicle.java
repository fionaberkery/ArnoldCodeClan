package vehicleComponents;

public abstract class Vehicle {

    private double price;
    private String colour;
    private double mileage;
    Engine engine;
    SteeringWheel steeringWheel;
    Tyre tyre;

    public Vehicle(double price, String colour, double mileage, Engine engine, SteeringWheel steeringWheel, Tyre tyre) {
        this.price = price;
        this.colour = colour;
        this.mileage = mileage;
        this.engine = engine;
        this.steeringWheel = steeringWheel;
        this.tyre = tyre;
    }
}
