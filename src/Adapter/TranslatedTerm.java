package Adapter;

public class TranslatedTerm {
    private String term;
    private String termForeign;

    public TranslatedTerm(String term, String termForeign) {
        this.term = term;
        this.termForeign = termForeign;
    }

    public String getTerm() {
        return term;
    }

    public String getTermForeign() {
        return termForeign;
    }
}
