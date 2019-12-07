package ChainOfResponsability;

public abstract class Approver {
    public Approver successor;

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(Purchase purchase);
}
