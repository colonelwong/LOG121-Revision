package Mediator;

public interface InterfaceChatRoom {
    public void register(User user);
    public void send(String sentFrom, String sendTo, String message);
}
