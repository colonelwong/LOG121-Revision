package Decorator;

public abstract class DrinkExtra extends Drink {
    private Drink drink;

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
}
