package Memento;

import java.util.ArrayList;
import java.util.List;

public class GameSaves {
    private List<Memento> mementoSaves = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoSaves.add(state);
    }

    public Memento get(int index) {
        return mementoSaves.get(index);
    }
}
