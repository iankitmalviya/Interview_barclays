package DesignPattern.Creational.Factory;

public class Main {

    public static void main(String[] args) {


        Car ice1 = IceCreamFactory.getIcream("chocolate");
        ice1.serve();
        Car ice2 = IceCreamFactory.getIcream("vanilla");
        ice2.serve();


        Car car1 = carFactory.getCar("aane ki ticket");
        car1.serve();
        Car car2 = carFactory.getCar("janne ki ticket");
        car2.serve();
    }


}
