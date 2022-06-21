import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import people.Customer;
import vehicleComponents.Engine;
import vehicleComponents.SteeringWheel;
import vehicleComponents.Tyre;
import vehicleComponents.componentType.EngineType;
import vehicleComponents.componentType.TyreType;
import vehicles.Vehicle;
import vehicles.vehicleTypes.ElectricCar;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    ElectricCar electricCar;
    Engine electricEngine;
    SteeringWheel steeringWheel;
    Tyre tubeTyre;


    @Before
    public void before(){
        customer = new Customer(20000);
        electricEngine = new Engine(EngineType.ELECTRIC);
        steeringWheel = new SteeringWheel(true);
        tubeTyre = new Tyre(TyreType.TUBE);
        electricCar = new ElectricCar(10000, "White", 0.00, electricEngine, steeringWheel, tubeTyre);
    }

    @Test
    public void customerHasMoneyInWallet(){
        assertEquals(20000, customer.getWalletAmount(), 0.01);
    }

    @Test
    public void customerHasNoOwnedVehicles(){
        assertEquals(0, customer.getOwnedVehicles());
    }

    @Test
    public void customerCanBuyVehicle(){
        customer.buyVehicle(electricCar);
        assertEquals(1, customer.getOwnedVehicles());
        assertEquals(10000, customer.getWalletAmount(), 0.01);
    }
}
