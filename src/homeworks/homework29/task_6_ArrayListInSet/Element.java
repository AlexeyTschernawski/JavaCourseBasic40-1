package homeworks.homework29.task_6_ArrayListInSet;

import java.util.Objects;

public class Element {
    private String name;

    public Element(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " " +
                " " + name + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Element element)) return false;
        return Objects.equals(getName(), element.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
