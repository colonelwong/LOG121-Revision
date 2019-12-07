package Adapter;

import java.util.ArrayList;

public class Adapter extends Dictionary {
    private ArrayList<TranslatedTerm> translatedTerms;
    private String word;

    public Adapter() {
        super();
        translatedTerms = new ArrayList<TranslatedTerm>();
        translatedTerms.add(new TranslatedTerm("apple", "pomme"));
        translatedTerms.add(new TranslatedTerm("phone", "téléphone"));
        translatedTerms.add(new TranslatedTerm("beer", "bière"));
    }

    @Override
    public String getDefinition(String word) {
        String definition = "";
        for (TranslatedTerm term : translatedTerms) {
            if (term.getTermForeign().equals(word)) {
                definition = super.getDefinition(term.getTerm());
            }
        }
        return definition;
    }
}
