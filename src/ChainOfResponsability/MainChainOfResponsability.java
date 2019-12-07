package ChainOfResponsability;

public class MainChainOfResponsability {

    public static void main(String[] args) {
        Approver director = new Director();
        Approver vicePresident = new VicePresident();
        Approver president = new President();

        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);

        director.processRequest(new Purchase(123, "just for fun", 50.0));

        director.processRequest(new Purchase(456, "Mac Pro Monitor Stand", 999.99));

        director.processRequest(new Purchase(789, "Expensive stuff", 100000.0));

        director.processRequest(new Purchase(420, "Useful car", 250000.0));
    }
}
