package DesignPattern.Creational.Builder;

public class main {
    public static void main(String[] args) {

Burger b=Burger.builder().bun("wheat").patty("aalo").build();
        System.out.println(b.toString());
    }
}
