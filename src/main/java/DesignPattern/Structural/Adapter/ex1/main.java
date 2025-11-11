package DesignPattern.Structural.Adapter.ex1;

public class main {
    public static void main(String[] args) {

        new AssignementClient().writeAssingment("document pe...", new penAdapter(new TrimaxGel()));

    }
}


