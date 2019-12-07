package Strategy;

public class StrategyAdd implements StrategyInterface {
    @Override
    public int operation(int counter) {
        System.out.println("Adding 5 to " + counter);
        System.out.println(counter + " + 5 = " + (counter += 5));
        return counter;
    }
}
