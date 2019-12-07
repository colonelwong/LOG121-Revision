package Mediator;

public abstract class User {
    private String username;
    private InterfaceChatRoom chatRoom;

    public User(String username) {
        this.username = username;
    }

    public void send(String sendTo, String message) {
        chatRoom.send(username, sendTo, message);
    }

    public abstract void receive(String sentFrom, String message);

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setChatRoom(InterfaceChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }
}
