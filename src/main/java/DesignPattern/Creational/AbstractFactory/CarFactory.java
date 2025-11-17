package DesignPattern.Creational.AbstractFactory;

public class CarFactory extends VehicleFactory {
    public static Vehicle getYourCar(String car) {
        if(car.equalsIgnoreCase("BMW"))return new BMW();
        if(car.equalsIgnoreCase("Audi"))return new Audi();
        if(car.equalsIgnoreCase("Maruti"))return new Maruti();
    return null;
    }
}
