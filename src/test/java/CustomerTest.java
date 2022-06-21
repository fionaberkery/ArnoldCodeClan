import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import people.Customer;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer(20000);
    }

    @Test
    public void customerHasMoneyInWallet(){
        assertEquals(20000, customer.getWalletAmount(), 0.01);
    }

    @Test
    public void customerHasNoOwnedVehicles(){
        assertEquals(0, customer.getOwnedVehicles());
    }
}
