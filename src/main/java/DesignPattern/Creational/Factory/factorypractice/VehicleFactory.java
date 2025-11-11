package DesignPattern.Creational.Factory.factorypractice;

public class VehicleFactory {

    public static Vehicle getVehicle(String x) {
        if (x.equalsIgnoreCase("audi")) return new Audi();
    return null;
    }
}
