package DesignPattern.Creational.Factory;

public class IceCreamFactory{
   public static Car getIcream(String x){
       if(x.equalsIgnoreCase("chocolate"))return new ChocolateIceCream();
       if(x.equalsIgnoreCase("vanilla"))return new VanillaIceCream();
       return null;
   }
}
