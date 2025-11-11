package DesignPattern.Structural.Decorator;

public class Milk implements Decorator {
    Beverages b;
    Milk(Beverages b){
       this.b=b;
    }
    @Override
    public int cost() {
        return this.b.cost()+5;
    }
}
