package Decorator;

import java.text.DecimalFormat;

public class MainDecorator {

    public static void main(String [] args) {
        double cost;
        DecimalFormat decim = new DecimalFormat("0.00");

        Coffee coffee = new Coffee();
        cost = coffee.getCost();
        System.out.println("Coffee: " + decim.format(cost) + "$");

        Tea tea = new Tea();
        cost = tea.getCost();
        System.out.println("Tea: " + decim.format(cost) + "$");

        DrinkExtraMilk coffeeExtraMilk = new DrinkExtraMilk();
        coffeeExtraMilk.setDrink(coffee);
        cost = coffeeExtraMilk.getCost();
        System.out.println("Coffee (extra milk): " + decim.format(cost) + "$");

        DrinkExtraSugar teaExtraSugar = new DrinkExtraSugar();
        teaExtraSugar.setDrink(tea);
        cost = teaExtraSugar.getCost();
        System.out.println("Tea (extra sugar): " + decim.format(cost) + "$");

        DrinkExtraMilk teaExtraSugarMilk = new DrinkExtraMilk();
        teaExtraSugarMilk.setDrink(teaExtraSugar);
        cost = teaExtraSugarMilk.getCost();
        System.out.println("Tea (extra sugar + milk): " + decim.format(cost) + "$");
    }
}
