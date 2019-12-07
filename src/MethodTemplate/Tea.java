package MethodTemplate;

public class Tea extends Drink {

    @Override
    public void warmUpWater() {
        System.out.println("Boil water up to 70 deg Celsius");
    }

    @Override
    public void brew() {
        System.out.println("Let the tea steep for 5 minutes");
    }

    @Override
    public void addExtra() {
        System.out.println("Add lemon extract");
    }
}
