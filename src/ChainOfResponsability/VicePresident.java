package ChainOfResponsability;

public class VicePresident extends Approver {

    private final double MAX_AMOUNT = 25000.0;

    @Override
    public void processRequest(Purchase purchase) {
        if (purchase.getAmount() >= MAX_AMOUNT) {
            System.out.println(getClass().getSimpleName() + " could not approve the request #" + purchase.getNumber());
            System.out.println(getClass().getSimpleName() + " is transferring to " + successor.getClass().getSimpleName());
            successor.processRequest(purchase);
        } else {
            System.out.println(getClass().getSimpleName() + " has approved the request #" + purchase.getNumber());
        }
    }
}
