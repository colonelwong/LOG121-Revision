package MethodTemplate;

public class Coffee extends Drink {

    @Override
    public void warmUpWater() {
        System.out.println("Boil water up to 100 deg Celsius");
    }

    @Override
    public void brew() {
        System.out.println("Let the coffee steep for 3 minutes");
    }

    @Override
    public void addExtra() {
        System.out.println("Add sugar and milk");
    }
}
