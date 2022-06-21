package people;
import vehicles.Vehicle;
import java.util.ArrayList;

public class Customer {

    private double wallet;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(double wallet) {
        this.wallet = wallet;
        this.ownedVehicles = new ArrayList<>();
    }

    public double getWalletAmount() {
        return this.wallet;
    }

    public int getOwnedVehicles() {
        return ownedVehicles.size();
    }
}
