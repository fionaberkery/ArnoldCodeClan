import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Tyre;
import vehicleComponents.componentType.TyreType;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre(TyreType.TUBE);
    }

    @Test
    public void tyreHasType(){
        assertEquals(TyreType.TUBE, tyre.getTyreType());
    }

    @Test
    public void tyreHasPrice(){
        assertEquals(120.50, tyre.getTyreType().getTyrePrice(),0.01);
    }

}
