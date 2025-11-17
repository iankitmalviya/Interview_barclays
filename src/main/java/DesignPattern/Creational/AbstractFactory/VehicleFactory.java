package DesignPattern.Creational.AbstractFactory;

public class VehicleFactory{

    public static CarFactory getCarFactory() {
        return new CarFactory();
    }
    public static BikeFactory getBikeFactory() {
        return new BikeFactory();
    }
}

