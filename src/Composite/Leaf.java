package Composite;

public class Leaf extends Component {
    String type = "file";
    String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void operation() {

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
