package vehicleComponents.componentType;

public enum EngineType {

    THERMAL_COMBUSTION("HP: 300-1500"),
    DIESEL("HP: 100-1000"),
    ELECTRIC("HP: 300-760"),
    HYBRID("HP: 250-900");

    private final String horsepower;

    EngineType(String horsepower) {
        this.horsepower = horsepower;
    }

    public String getHorsePower() {
        return this.horsepower;
    }
}
