package vehicleTests;

import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Engine;
import vehicleComponents.SteeringWheel;
import vehicleComponents.Tyre;
import vehicleComponents.componentType.EngineType;
import vehicleComponents.componentType.TyreType;
import vehicles.vehicleTypes.PetrolCar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PetrolCarTest {

    Engine petrolEngine;
    SteeringWheel steeringWheel;
    Tyre tubeTyre;
    PetrolCar petrolCar;

    @Before
    public void before(){
        petrolEngine = new Engine(EngineType.THERMAL_COMBUSTION);
        steeringWheel = new SteeringWheel(true);
        tubeTyre = new Tyre(TyreType.TUBE);
        petrolCar = new PetrolCar(3000, "Silver", 5000, petrolEngine, steeringWheel, tubeTyre);
    }

    @Test
    public void carHasAPrice(){
        assertEquals(3000, petrolCar.getPrice(), 0.01);
    }

    @Test
    public void carHasAColour(){
        assertEquals("Silver", petrolCar.getColour());
    }

    @Test
    public void carHasMileage(){
        assertEquals(5000, petrolCar.getMileage(), 0.01);
    }

    @Test
    public void carHasAnEngineType(){
        assertEquals(EngineType.THERMAL_COMBUSTION, petrolCar.getEngineType());
    }

    @Test
    public void carHasPowerSteering(){
        assertTrue(petrolCar.hasPowerSteering());
    }

    @Test
    public void carTyreType(){
        assertEquals(TyreType.TUBE, petrolCar.getTyreType());
    }




}
