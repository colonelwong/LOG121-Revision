package Adapter;

public class MainAdapter {

    public static void main(String [] args) {
        String englishWord = "apple";
        String frenchWord = "bière";
        String definition;

        Dictionary englishDictionnary = new Dictionary();
        Adapter translator = new Adapter();

        definition = englishDictionnary.getDefinition(englishWord);
        if (definition.isEmpty()) {
            System.err.println("The word " + englishWord + " is not in the dictionary.");
        } else {
            System.out.println(englishWord + ": " + definition);
        }

        definition = translator.getDefinition(frenchWord);
        if (definition.isEmpty()) {
            System.err.println("The word " + frenchWord + " is not in the dictionary.");
        } else {
            System.out.println(frenchWord + ": " + definition);
        }

        System.out.println("\n***************************************************");
        System.out.println("************ Mon exemple n'est pas bon ************");
        System.out.println("***************************************************");
    }
}
