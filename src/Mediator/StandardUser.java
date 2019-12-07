package Mediator;

public class StandardUser extends User {

    public StandardUser(String username) {
        super(username);
    }

    @Override
    public void receive(String sentFrom, String message) {
        System.out.println(getUsername() + " has received a message!");
        System.out.println("\tFrom: " + sentFrom);
        System.out.println("\tMessage: " + message);

    }
}
