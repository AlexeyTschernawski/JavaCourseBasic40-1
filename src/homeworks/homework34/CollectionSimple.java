package homeworks.homework34;

import java.util.ArrayList;
import java.util.List;

public class CollectionSimple {

    private List<String> elements;

    public CollectionSimple(String element) {
        this.elements = new ArrayList<>();
        this.elements.add(element);
    }

    public String getElement() {
        if (!elements.isEmpty()) {
            return elements.get(0);
        } else {
            return null;
        }
    }

    public void setElement(String element) {
        elements.clear();
        elements.add(element);
    }

    public void addElement(String element) {
        elements.add(element);
    }

    public void add(int index, String element) {
        elements.add(index, element);
    }

    @Override
    public String toString() {
        return elements.toString();
    }

}