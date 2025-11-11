package DesignPattern.Structural.Decorator.ex1;

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
