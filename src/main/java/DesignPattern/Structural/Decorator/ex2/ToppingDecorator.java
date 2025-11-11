package DesignPattern.Structural.Decorator.ex2;

abstract class ToppingDecorator implements Pizza {
    protected Pizza pizzaToWrap; // Yeh us pizza ko pakad ke rakhta hai jise wrap karna hai

    public ToppingDecorator(Pizza pizza) {
        this.pizzaToWrap = pizza;
    }

    // Yeh description/cost apne wrapped pizza se leta hai
    public String getDescription() {
        return pizzaToWrap.getDescription();
    }
    public int getCost() {
        return pizzaToWrap.getCost();
    }
}
