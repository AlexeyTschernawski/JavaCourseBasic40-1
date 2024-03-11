package homeworks.homework34.homework;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithMethods<E> {

    private List<E> element;
    private int size;
    private Object[] elements;




    public CollectionWithMethods() {
        this.element = new ArrayList<>();
        this.size = 0;
    }

    public void add(E element) {
        this.element.add(element);
    }

    public void add(int index, E element) {
        this.element.add(index, element);
    }

    public E get(int index) {
        return element.get(index);
    }

    public int size() {
        return element.size();
    }

    public void remove(E element) {
        this.element.remove(element);
    }

    public void remove(int index){
        element.remove(index);
    }


    private Boolean checkIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("not exists "+index+ " Size = "+size);
            return false;
        }return true;
    }

    public void remove2(int index) {
        if (checkIndex(index)) {

            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }

            elements[--size] = null;
        }
    }


}