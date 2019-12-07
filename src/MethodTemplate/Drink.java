package MethodTemplate;

public abstract class Drink {

    final void prepare() {
        warmUpWater();
        brew();
        serve();
        addExtra();
    }

    public abstract void warmUpWater();

    public abstract void brew();

    public void serve() {
        System.out.println("Serve in a mug");
    }

    public abstract void addExtra();
}
