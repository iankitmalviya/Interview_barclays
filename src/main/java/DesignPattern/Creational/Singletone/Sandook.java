package DesignPattern.Creational.Singletone;

public class Sandook {

    private static Sandook chabi;


    private Sandook() {
         System.out.println("Chabi ban gai");
     }

    public static Sandook getChabi(){

        if(chabi==null){
            chabi=new Sandook();
            return chabi ;
        }
       return chabi;
    }

}
