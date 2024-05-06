package lab.assignment.beforerefactoring.clientcode;

import lab.assignment.beforerefactoring.CoffeeMaker;
import lab.assignment.beforerefactoring.MochaMaker;
import lab.assignment.beforerefactoring.CapuccinoMaker;
import lab.assignment.beforerefactoring.AmericanoMaker;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMaker starbuzz = new MochaMaker();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new CapuccinoMaker();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new AmericanoMaker();
        starbuzz.prepareCoffee();

    }

}
