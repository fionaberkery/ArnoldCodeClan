package vehicleTests;

import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Engine;
import vehicleComponents.SteeringWheel;
import vehicleComponents.Tyre;
import vehicleComponents.componentType.EngineType;
import vehicleComponents.componentType.TyreType;
import vehicles.vehicleTypes.DieselCar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DieselCarTest {

    Engine dieselEngine;
    SteeringWheel steeringWheel;
    Tyre tubelessTyre;
    DieselCar dieselCar;

    @Before
    public void before(){
        dieselEngine = new Engine(EngineType.DIESEL);
        steeringWheel = new SteeringWheel(true);
        tubelessTyre = new Tyre(TyreType.TUBELESS);
        dieselCar = new DieselCar(5000, "Black", 8000, dieselEngine, steeringWheel, tubelessTyre);
    }

    @Test
    public void carHasAPrice(){
        assertEquals(5000, dieselCar.getPrice(), 0.01);
    }

    @Test
    public void carHasAColour(){
        assertEquals("Black", dieselCar.getColour());
    }

    @Test
    public void carHasMileage(){
        assertEquals(8000, dieselCar.getMileage(), 0.01);
    }

    @Test
    public void carHasAnEngineType(){
        assertEquals(EngineType.DIESEL, dieselCar.getEngineType());
    }

    @Test
    public void carHasPowerSteering(){
        assertTrue(dieselCar.hasPowerSteering());
    }

    @Test
    public void carTyreType(){
        assertEquals(TyreType.TUBELESS, dieselCar.getTyreType());
    }




}
