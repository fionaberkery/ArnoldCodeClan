package vehicleTests;

import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Engine;
import vehicleComponents.SteeringWheel;
import vehicleComponents.Tyre;
import vehicleComponents.componentType.EngineType;
import vehicleComponents.componentType.TyreType;
import vehicles.vehicleTypes.HybridCar;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HybridCarTest {

    Engine hybridEngine;
    SteeringWheel steeringWheel;
    Tyre radialplyTyre;
    HybridCar hybridCar;

    @Before
    public void before(){
        hybridEngine = new Engine(EngineType.HYBRID);
        steeringWheel = new SteeringWheel(true);
        radialplyTyre = new Tyre(TyreType.RADIAL_PLY);
        hybridCar = new HybridCar(8000, "Blue", 700, hybridEngine, steeringWheel, radialplyTyre);
    }

    @Test
    public void carHasAPrice(){
        assertEquals(8000, hybridCar.getPrice(), 0.01);
    }

    @Test
    public void carHasAColour(){
        assertEquals("Blue", hybridCar.getColour());
    }

    @Test
    public void carHasMileage(){
        assertEquals(700, hybridCar.getMileage(), 0.01);
    }

    @Test
    public void carHasAnEngineType(){
        assertEquals(EngineType.HYBRID, hybridCar.getEngineType());
    }

    @Test
    public void carHasPowerSteering(){
        assertTrue(hybridCar.hasPowerSteering());
    }

    @Test
    public void carTyreType(){
        assertEquals(TyreType.RADIAL_PLY, hybridCar.getTyreType());
    }




}
