package vehicleComponents;

public class SteeringWheel {

    private boolean powerSteering;

    public SteeringWheel(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }


    public boolean hasPowerSteering() {
        return this.powerSteering;
    }
}
