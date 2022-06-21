package vehicleComponents;

import vehicleComponents.componentType.TyreType;

public class Tyre {

    TyreType tyreType;

    public Tyre(TyreType tyreType) {
        this.tyreType = tyreType;
    }

    public TyreType getTyreType() {
        return this.tyreType;
    }
}
