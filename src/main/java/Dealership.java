import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;

public class Dealership {

    private ArrayList<Vehicle> stock;
    private double till;

    public Dealership(ArrayList<Vehicle> stock, double till) {
        this.stock = stock;
        this.till = till;
    }


    public int getStock() {
        return stock.size();
    }


    public double getTillAmount() {
        return this.till;
    }
}
