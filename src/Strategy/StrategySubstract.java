package Strategy;

public class StrategySubstract implements StrategyInterface {
    @Override
    public int operation(int counter) {
        System.out.println("Subtracting 1 to " + counter);
        System.out.println(counter + " - 1 = " + (counter -= 1));
        return counter;
    }
}