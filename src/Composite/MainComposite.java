package Composite;

import java.awt.*;
import java.util.Scanner;

public class MainComposite {

    public static void main(String [] args) {
        Composite current;
        String[] command = null;
        Scanner input = new Scanner(System.in);

        Composite root = new Composite("/");
        Composite bin = new Composite("bin/");
        Composite boot = new Composite("boot/");
        Composite dev = new Composite("dev/");
        Composite etc = new Composite("etc/");
        Composite home = new Composite("home/");
        Composite lib = new Composite("lib/");
        Composite wong = new Composite("wong/");

        Leaf file1 = new Leaf("file1");
        Leaf file2 = new Leaf("file2");
        Leaf file3 = new Leaf("file3");
        Leaf file4 = new Leaf("file4");
        Leaf file5 = new Leaf("hello.txt");
        Leaf file6 = new Leaf("file5");
        Leaf file7 = new Leaf("stuff.txt");

        root.add(bin);
        bin.add(file1);

        root.add(boot);
        boot.add(file2);

        root.add(dev);
        dev.add(file3);

        root.add(etc);
        etc.add(file4);

        root.add(home);
        home.add(wong);
        wong.add(file5);

        root.add(lib);
        lib.add(file6);

        root.add(file7);

        current = root;

        do {
            System.out.print("wong@ubuntu:" + current.getCurrentPath() + "$ ");
            String rawCommand = input.nextLine();
            command = rawCommand.split(" ", 2);
            switch (command[0]) {
                case "cd":
                    if (command.length == 2) {
                        if (command[1].equals("..")) {
                            if (current.getParent() != null) {
                                current = current.getParent();
                            }
                        } else {
                            for (Component item : current.getChilds()) {
                                if (command[1].equals(item.getName())) {
                                    if (item instanceof Composite) {
                                        current = (Composite) item;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case "..":
                    if (current.getParent() != null)
                        current = current.getParent();
                    break;
                case "ls":
                    current.printChilds();
                case "exit":
                    break;
                default:
                    System.err.println("Invalid command");
                    break;
            }
        } while (!(command[0].equals("exit")));
    }
}
