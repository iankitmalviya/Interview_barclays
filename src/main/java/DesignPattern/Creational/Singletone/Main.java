package DesignPattern.Creational.Singletone;

public class Main {

    public static void main(String[] args) {
        Sandook x= Sandook.getChabi();
        System.out.println(x.toString());
        Sandook b=Sandook.getChabi();
        System.out.println(b.toString());

    }
}
