package Observer;

public class ConcreteObserver implements Observer {
    int id;

    public ConcreteObserver(int id) {
        this.id = id;
    }

    @Override
    public void update() {
        System.out.println("The observer (ID: " + id + ") has been notified");
    }
}
