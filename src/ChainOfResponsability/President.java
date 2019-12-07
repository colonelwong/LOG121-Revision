package ChainOfResponsability;

public class President extends Approver {

    private final double MAX_AMOUNT = 122100.0;

    @Override
    public void processRequest(Purchase purchase) {
        if (purchase.getAmount() >= MAX_AMOUNT) {
            System.out.println(getClass().getSimpleName() + " could not approve the request #" + purchase.getNumber());
            System.out.println(getClass().getSimpleName() + " is transferring to executive committee");
        } else {
            System.out.println(getClass().getSimpleName() + " has approved the request #" + purchase.getNumber());
        }
    }
}
