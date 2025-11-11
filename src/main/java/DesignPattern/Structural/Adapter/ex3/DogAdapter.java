package DesignPattern.Structural.Adapter.ex3;

public class DogAdapter implements Cat{
    Dog dog;
public DogAdapter(Dog dog){
this.dog=dog;
}
    @Override
    public void meow() {
    //Now meow call will converted to bark
dog.bark();
    }
}
