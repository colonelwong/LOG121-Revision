package Observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {
    private ArrayList<Observer> observers;
    private int counter = 0;
    private boolean state;

    public ConcreteSubject() {
        observers = new ArrayList<Observer>();
        state = true;
    }

    public void add() {
        System.out.println(counter);
        if(counter % 10 == 0 && counter > 0)
            notifyObservers();
        if(counter >= 100)
            setState(false);
        counter++;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public int getCounter() {
        return counter;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
