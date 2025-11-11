package DesignPattern.Structural.Decorator.ex2;

public class PlainPizza implements  Pizza{
    @Override
    public String getDescription() {
        return "Plain Pizza Base";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
