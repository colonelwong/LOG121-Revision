package Mediator;

import java.util.HashMap;

public class ChatRoom implements InterfaceChatRoom {
    private HashMap users = new HashMap();

    @Override
    public void register(User user) {
        if (!(users.containsKey(user.getUsername()))) {
            users.put(user.getUsername(), user);
        }
        user.setChatRoom(this);
    }

    @Override
    public void send(String sentFrom, String sendTo, String message) {
        if (users.containsKey(sendTo)) {
            User u = (User) users.get(sendTo);
            u.receive(sentFrom, message);
        }
    }


}
