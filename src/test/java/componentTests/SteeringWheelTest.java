package componentTests;

import org.junit.Before;
import org.junit.Test;
import vehicleComponents.SteeringWheel;

import static org.junit.Assert.*;

public class SteeringWheelTest {

    SteeringWheel steeringWheel;

    @Before
    public void before(){
        steeringWheel = new SteeringWheel(true);
    }

    @Test
    public void steeringWheelHasPowerSteeringTRUE(){
        assertTrue(steeringWheel.hasPowerSteering());
    }

    @Test
    public void steeringWheelHasPowerSteeringFALSE(){
        steeringWheel = new SteeringWheel(false);
        assertFalse(steeringWheel.hasPowerSteering());
    }

}
