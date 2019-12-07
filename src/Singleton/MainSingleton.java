package Singleton;

public class MainSingleton {

    public static void main(String[] args) {
        MySingleton database = MySingleton.getInstance();

        database.addString("Allo! ");
        database.addString("Comment ");
        database.addString("ça ");
        database.addString("va? ");

        System.out.println(database.toString());
    }
}
