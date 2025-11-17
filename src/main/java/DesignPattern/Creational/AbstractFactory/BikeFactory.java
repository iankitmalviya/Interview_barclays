package DesignPattern.Creational.AbstractFactory;

public class BikeFactory extends VehicleFactory {

    public static Vehicle getYourBike(String car) {
        if(car.equalsIgnoreCase("pulsar"))return new Pulsar();
        return null;
    }
}
