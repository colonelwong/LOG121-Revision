package Decorator;

public class DrinkExtraSugar extends DrinkExtra{
    double cost = 0.10;

    public double getCost() {
        return (getDrink().getCost() + this.cost);
    }
}
