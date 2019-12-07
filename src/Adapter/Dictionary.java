package Adapter;

import java.util.ArrayList;

public class Dictionary {
    ArrayList<Term> terms;

    public Dictionary() {
        terms = new ArrayList<Term>();

        terms.add(new Term("apple", "a fruit"));
        terms.add(new Term("phone", "a device used to call people"));
        terms.add(new Term("beer", "an alcoholic drink"));
    }

    public String getDefinition(String word) {
        String definition = "";
        for (Term term : terms) {
            if (term.getWord().equals(word)) {
                definition = term.getDefinition();
            }
        }
        return definition;
    }

    public void getDefinition() {

    }
}
