package Composite;

import java.util.ArrayList;

public class Composite extends Component {

    ArrayList<Component> childs;
    Composite parent;
    String type = "folder";
    String name;

    public Composite(String name) {
        childs = new ArrayList<Component>();
        this.name = name;
    }

    public void operation () {

    }

    public void add(Component component) {
        childs.add(component);
        if (component instanceof Composite)
            ((Composite) component).setParent(this);
    }

    public void remove(Component component) {
        childs.remove(component);
    }

    public ArrayList<Component> getChilds() {
        return childs;
    }

    public void printChilds() {
        for (Component item : childs) {
            System.out.println("\t" + item.getName() + "\t\t[" + item.getType() + "]");
        }
    }

    public Composite getParent() {
        return parent;
    }

    public void setParent(Composite parent) {
        this.parent = parent;
    }

    public String getCurrentPath() {
        if (parent == null) {
            return name;
        } else {
            return parent.getCurrentPath() + name;
        }
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
