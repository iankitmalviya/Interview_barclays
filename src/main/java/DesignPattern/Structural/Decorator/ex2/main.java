package DesignPattern.Structural.Decorator.ex2;

public class main {
    public static void main(String[] args) {
        // 1. Pehle plain pizza lo
        Pizza myPizza = new PlainPizza();
        System.out.println(myPizza.getDescription() + " | Cost: " + myPizza.getCost());

        // 2. Ab use Cheese mein wrap karo
        myPizza = new CheeseTopping(myPizza);
        System.out.println(myPizza.getDescription() + " | Cost: " + myPizza.getCost());

        // 3. Ab us poore (cheese waale) ko Olives mein wrap karo
        myPizza = new OlivesTopping(myPizza);
        System.out.println(myPizza.getDescription() + " | Cost: " + myPizza.getCost());
    }
}
