package DesignPattern.Structural.Adapter.ex3;

public class main {
    public static void main(String[] args) {

        Dog fluffy = new Dog();
        Cat catAdapter = new DogAdapter(fluffy); // Wrap the dog in the adapter

        System.out.println("Making the 'cat' speak:");

        // Your code calls meow(), but "Woof Woof!" will print.
        catAdapter.meow();
    }
}
