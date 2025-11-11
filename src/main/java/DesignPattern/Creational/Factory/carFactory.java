package DesignPattern.Creational.Factory;

public class carFactory {
    public static Car getCar(String x){
        if(x.equalsIgnoreCase("porsche"))return new Porshe();
        if(x.equalsIgnoreCase("bmw"))return new BMW();
        return null;
    }
}
