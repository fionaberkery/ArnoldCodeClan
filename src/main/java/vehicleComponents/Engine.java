package vehicleComponents;
import vehicleComponents.componentType.EngineType;

public class Engine {

    EngineType engineType;

    public Engine(EngineType engineType) {
        this.engineType = engineType;
    }

    public EngineType getEngineType() {
        return this.engineType;
    }
}
