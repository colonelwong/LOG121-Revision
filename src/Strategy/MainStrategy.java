package Strategy;

public class MainStrategy {

    public static void main(String [] args) {
        int counter = 0;
        StrategyInterface strategy;

        while (counter <= 50) {
            if (counter % 2 == 0) {
                strategy = new StrategyAdd();
                counter = strategy.operation(counter);
            } else {
                strategy = new StrategySubstract();
                counter = strategy.operation(counter);
            }
        }

        System.out.println("\n************************");
        System.out.println("The program has finished");
        System.out.println("************************");
    }
}
