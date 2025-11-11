package DesignPattern.Creational.Factory.factorypractice;

public class main {
    public static void main(String[] args) {
        Vehicle audi=VehicleFactory.getVehicle("audi");
        audi.run();
    }
}
