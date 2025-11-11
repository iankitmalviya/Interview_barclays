package DesignPattern.Creational.Builder;

import lombok.Builder;

@Builder
public class Burger {

    String bun;
    String patty;
    String cheese;

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", patty='" + patty + '\'' +
                ", cheese='" + cheese + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }

    String sauce;/*

    public Burger(BurgerBuilder builder) {
        this.bun=builder.bun;
        this.cheese=builder.cheese;
        this.patty=builder.patty;
        this.sauce=builder.sauce;
    }
*/
  /*  void showBurger() {
        System.out.println("berger.." + (bun != null ? " bun : " + bun : "")+ (cheese != null ? " cheese : " + cheese : "")+ (patty != null ? " patty : " + patty : "")+ (sauce != null ? " sauce : " + sauce : ""));
    }
*/
   /* static class BurgerBuilder {
        String bun;
        String patty;
        String cheese;

        String sauce;

        public BurgerBuilder setBun(String bun) {
            this.bun = bun;
            return this;
        }

        public BurgerBuilder setPatty(String patty) {
            this.patty = patty;
            return this;
        }

        public BurgerBuilder setCheese(String cheese) {
            this.cheese = cheese;
            return this;

        }

        public BurgerBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }*/

}
