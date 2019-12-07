package Memento;

public class MainMemento {

    public static void main(String[] args) {
        GameProgression gameProgression = new GameProgression();
        GameSaves gameSaves = new GameSaves();
        GameState gameState;

        // Save #0
        gameProgression.setState(new GameState(1, 100, 50, "HarryPotter"));
        gameSaves.add(gameProgression.saveStateToMemento());
        System.out.println("Saved the following state to memento:");
        gameProgression.getState().printState();

        // Save #1
        gameProgression.setState(new GameState(8, 150, 70, "HarryPotter"));
        gameSaves.add(gameProgression.saveStateToMemento());
        System.out.println("Saved the following state to memento:");
        gameProgression.getState().printState();

        // Save #2
        gameProgression.setState(new GameState(12, 183, 85, "HarryPotter"));
        gameSaves.add(gameProgression.saveStateToMemento());
        System.out.println("Saved the following state to memento:");
        gameProgression.getState().printState();

        // Save #3
        gameProgression.setState(new GameState(15, 205, 96, "HarryPotter"));
        gameSaves.add(gameProgression.saveStateToMemento());
        System.out.println("Saved the following state to memento:");
        gameProgression.getState().printState();

        // Save #4
        gameProgression.setState(new GameState(23, 282, 111, "HarryPotter"));
        gameSaves.add(gameProgression.saveStateToMemento());
        System.out.println("Saved the following state to memento:");
        gameProgression.getState().printState();

        // Restoring save #3
        gameProgression.getStateFromMemento(gameSaves.get(3));
        System.out.println("Restored the following state from memento:");
        gameProgression.getState().printState();

        // Restoring save #0
        gameProgression.getStateFromMemento(gameSaves.get(0));
        System.out.println("Restored the following state from memento:");
        gameProgression.getState().printState();

        // Restoring save #4
        gameProgression.getStateFromMemento(gameSaves.get(4));
        System.out.println("Restored the following state from memento:");
        gameProgression.getState().printState();
    }
}
