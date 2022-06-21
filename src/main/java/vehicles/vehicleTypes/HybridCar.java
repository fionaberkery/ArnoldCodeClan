package vehicles.vehicleTypes;
import vehicleComponents.Engine;
import vehicleComponents.SteeringWheel;
import vehicleComponents.Tyre;
import vehicles.Vehicle;

public class HybridCar extends Vehicle {

    public HybridCar(double price, String colour, double mileage, Engine engine, SteeringWheel steeringWheel, Tyre tyre) {
        super(price, colour, mileage, engine, steeringWheel, tyre);
    }
}
