package Memento;

public class GameState {
    private int currentLevel;
    private int currentHealth;
    private int currentMagic;
    private String characterName;

    public GameState(int currentLevel, int currentHealth, int currentMagic, String characterName) {
        this.currentLevel = currentLevel;
        this.currentHealth = currentHealth;
        this.currentMagic = currentMagic;
        this.characterName = characterName;
    }

    public GameState(GameState state) {
        this.currentLevel = state.getCurrentLevel();
        this.currentHealth = state.getCurrentHealth();
        this.currentMagic = state.getCurrentMagic();
        this.characterName = state.getCharacterName();
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getCurrentMagic() {
        return currentMagic;
    }

    public void setCurrentMagic(int currentMagic) {
        this.currentMagic = currentMagic;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void printState() {
        System.out.println("\tLevel: " + currentLevel);
        System.out.println("\tHealth: " + currentHealth);
        System.out.println("\tMagic: " + currentMagic);
        System.out.println("\tCharacter: " + characterName);
    }
}
