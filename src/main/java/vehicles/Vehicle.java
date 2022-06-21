package vehicles;

import vehicleComponents.Engine;
import vehicleComponents.SteeringWheel;
import vehicleComponents.Tyre;
import vehicleComponents.componentType.EngineType;
import vehicleComponents.componentType.TyreType;

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

    public double getPrice() {
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }

    public double getMileage() {
        return this.mileage;
    }

    public EngineType getEngineType() {
        return engine.getEngineType();
    }

    public boolean hasPowerSteering() {
        return steeringWheel.hasPowerSteering();
    }

    public TyreType getTyreType() {
        return tyre.getTyreType();
    }
}
