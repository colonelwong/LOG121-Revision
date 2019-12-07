package Mediator;

public class MainMediator {

    public static void main(String[] args) {
        InterfaceChatRoom chatRoom = new ChatRoom();

        User user1 = new Moderator("supersudo27");
        User user2 = new StandardUser("wong");
        User user3 = new StandardUser("xX.uLtRaSkIlLz.Xx");

        chatRoom.register(user1);
        chatRoom.register(user2);
        chatRoom.register(user3);

        user1.send("wong", "hey wong");
        user2.send("xX.uLtRaSkIlLz.Xx", "this is a ps4 gamer");
        user3.send("supersudo27", "wong doesn't like me");
        user1.send("xX.uLtRaSkIlLz.Xx", "I'll ban him");
    }
}
