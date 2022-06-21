package componentTests;

import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Engine;
import vehicleComponents.componentType.EngineType;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine(EngineType.DIESEL);
    }

    @Test
    public void engineHasAType(){
        assertEquals(EngineType.DIESEL, engine.getEngineType());
    }

    @Test
    public void engineHasHorsePowerRange(){
        assertEquals("HP: 100-1000", engine.getEngineType().getHorsePower());
    }




}
