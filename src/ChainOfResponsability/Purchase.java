package ChainOfResponsability;

public class Purchase {
    int number;
    String purpose;
    double amount;

    public Purchase(int number, String purpose, double amount) {
        this.number = number;
        this.purpose = purpose;
        this.amount = amount;

        System.out.println("New purchase request:");
        System.out.println("\tNumber: " + number);
        System.out.println("\tPurpose: " + purpose);
        System.out.println("\tNumber: " + amount);
    }

    public int getNumber() {
        return number;
    }

    public String getPurpose() {
        return purpose;
    }

    public double getAmount() {
        return amount;
    }
}
