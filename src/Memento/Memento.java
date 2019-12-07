package Memento;

public class Memento {
    private GameState state;

    public Memento(GameState state) {
        this.state = new GameState(state);
    }

    public GameState getState() {
        return state;
    }
}
