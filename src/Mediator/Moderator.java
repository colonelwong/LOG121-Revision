package Mediator;

public class Moderator extends User {

    public Moderator(String username) {
        super(username);
    }

    @Override
    public void receive(String sentFrom, String message) {
        System.out.println("[M]" + getUsername() + " has received a message!");
        System.out.println("\tFrom: " + sentFrom);
        System.out.println("\tMessage: " + message);
    }
}
