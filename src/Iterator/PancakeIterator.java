package Iterator;

import java.util.ArrayList;

public class PancakeIterator implements Iterator {
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }
}
