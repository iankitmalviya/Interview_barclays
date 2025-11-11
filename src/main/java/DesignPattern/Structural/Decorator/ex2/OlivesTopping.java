package DesignPattern.Structural.Decorator.ex2;

class OlivesTopping extends ToppingDecorator {
    public OlivesTopping(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizzaToWrap.getDescription() + ", with Olives";
    }
    public int getCost() {
        return pizzaToWrap.getCost() + 30; //  (₹30 olives ka)
    }}