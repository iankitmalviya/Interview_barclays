package DesignPattern.Structural.Decorator;

public class main  {
    public static void main(String[] args) {
        System.out.println(new Caramel(new Milk(new Expresso())).cost());

    }

}
