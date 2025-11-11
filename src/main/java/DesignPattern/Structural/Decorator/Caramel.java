package DesignPattern.Structural.Decorator;

public class Caramel implements Decorator{
Beverages b;

    Caramel(Beverages beverages){
        this.b=beverages;
    }
    @Override
    public int cost() {
        return this.b.cost()+3;
    }
}
