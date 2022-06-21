package vehicleComponents.componentType;

public enum TyreType {

    TUBE(120.50),
    TUBELESS(155.50),
    CROSS_PLY(250.00),
    RADIAL_PLY(350.00);

    private final double price;

    TyreType(double price) {
        this.price = price;
    }

    public double getTyrePrice() {
        return this.price;
    }
}
