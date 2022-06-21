package vehicles.vehicleTypes;
import vehicleComponents.Engine;
import vehicleComponents.SteeringWheel;
import vehicleComponents.Tyre;
import vehicles.Vehicle;

public class DieselCar extends Vehicle {

    public DieselCar(double price, String colour, double mileage, Engine engine, SteeringWheel steeringWheel, Tyre tyre) {
        super(price, colour, mileage, engine, steeringWheel, tyre);
    }
}
