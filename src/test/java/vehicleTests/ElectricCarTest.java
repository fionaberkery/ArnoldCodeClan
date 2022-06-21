package vehicleTests;

import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Engine;
import vehicleComponents.SteeringWheel;
import vehicleComponents.Tyre;
import vehicleComponents.componentType.EngineType;
import vehicleComponents.componentType.TyreType;
import vehicles.vehicleTypes.DieselCar;
import vehicles.vehicleTypes.ElectricCar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ElectricCarTest {

    Engine electricEngine;
    SteeringWheel steeringWheel;
    Tyre tubeTyre;
    ElectricCar electricCar;

    @Before
    public void before(){
        electricEngine = new Engine(EngineType.ELECTRIC);
        steeringWheel = new SteeringWheel(true);
        tubeTyre = new Tyre(TyreType.TUBE);
        electricCar = new ElectricCar(10000, "White", 0.00, electricEngine, steeringWheel, tubeTyre);
    }

    @Test
    public void carHasAPrice(){
        assertEquals(10000, electricCar.getPrice(), 0.01);
    }

    @Test
    public void carHasAColour(){
        assertEquals("White", electricCar.getColour());
    }

    @Test
    public void carHasMileage(){
        assertEquals(0.00, electricCar.getMileage(), 0.01);
    }

    @Test
    public void carHasAnEngineType(){
        assertEquals(EngineType.ELECTRIC, electricCar.getEngineType());
    }

    @Test
    public void carHasPowerSteering(){
        assertTrue(electricCar.hasPowerSteering());
    }

    @Test
    public void carTyreType(){
        assertEquals(TyreType.TUBE, electricCar.getTyreType());
    }




}
