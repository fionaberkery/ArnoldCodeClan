import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Engine;
import vehicleComponents.SteeringWheel;
import vehicleComponents.Tyre;
import vehicleComponents.componentType.EngineType;
import vehicleComponents.componentType.TyreType;
import vehicles.Vehicle;
import vehicles.vehicleTypes.PetrolCar;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Vehicle vehicle;
    ArrayList<Vehicle> stock;
    Engine petrolEngine;
    SteeringWheel steeringWheel;
    Tyre tubeTyre;
    PetrolCar petrolCar;

    @Before
    public void before(){
        stock = new ArrayList<>();
        petrolEngine = new Engine(EngineType.THERMAL_COMBUSTION);
        steeringWheel = new SteeringWheel(true);
        tubeTyre = new Tyre(TyreType.TUBE);
        petrolCar = new PetrolCar(3000, "Silver", 5000, petrolEngine, steeringWheel, tubeTyre);
        stock.add(petrolCar);
        dealership = new Dealership(stock, 50000);
    }

    @Test
    public void dealershipHasStock(){
        assertEquals(1, dealership.getStock());
    }

    @Test
    public void dealershipHasMoneyInTill(){
        assertEquals(50000, dealership.getTillAmount(), 0.01);
    }
}
