package DesignPattern.Creational.AbstractFactory;

public class main {
    public static void main(String[] args) {
        System.out.println();

        Vehicle car =VehicleFactory.getCarFactory().getYourCar("audi");
        Vehicle bike =VehicleFactory.getBikeFactory().getYourBike("pulsar");
        car.drive();
        bike.drive();

    }
}