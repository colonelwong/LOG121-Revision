package Decorator;

public class DrinkExtraMilk extends DrinkExtra {
    double cost = 0.50;

    public double getCost() {
        return (getDrink().getCost() + this.cost);
    }
}
