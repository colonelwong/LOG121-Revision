package Singleton;

import java.util.ArrayList;

public class MySingleton {
    private static MySingleton database = null;
    private ArrayList<String> strings;

    private MySingleton() {
        strings = new ArrayList<>();
    }

    public static MySingleton getInstance() {
        if (database == null) {
            return new MySingleton();
        } else {
            return database;
        }
    }

    public void addString(String s) {
        strings.add(s);
    }

    public String toString() {
        StringBuilder finalString = new StringBuilder();
        for (String s : strings) {
            finalString.append(s);
        }
        return finalString.toString();
    }
}
