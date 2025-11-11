package DesignPattern.Structural.Decorator.ex2;

class CheeseTopping extends ToppingDecorator {
    public CheeseTopping(Pizza pizza) {
        super(pizza); // Wrapped pizza ko super class ko bhej do
    }


    public String getDescription() {
        return pizzaToWrap.getDescription() + ", with Extra Cheese";
    }
    public int getCost() {
        return pizzaToWrap.getCost() + 50; // (₹50 cheese ka)
    }
}