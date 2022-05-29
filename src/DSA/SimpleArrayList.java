package DSA;

import java.util.Iterator;

public class SimpleArrayList<T> implements ListInterface<T> {

    private T[] array;
    private int n = 0;
    private int defaultSize = 100;

    public SimpleArrayList() {
        array = (T[]) new Object[defaultSize];
    }

    public SimpleArrayList(int capacity) {
        array = (T[]) new Object[capacity];
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void output() {
        if (isEmpty()) {
            System.out.println("List is empty");
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    @Override
    public void add(T data) throws IllegalStateException {
        if (size() >= defaultSize) {
            throw new IllegalStateException("List is full!");
        }
        array[n] = data;
        n++;
    }

    @Override
    public T get(int i) {
        if (i >= n || i < 0) {
            return null;
        }
        return array[i];
    }

    @Override
    public void set(int i, T data) {
        if (i >= array.length || i < 0) {
            System.out.println("Index " + i + " is not valid");
        }
        array[i] = data;
    }

    @Override
    public void remove(T data) throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Can't remove " + data + " ,because list is empty");
        }
        for (int i = 0; i < n; i++) {
            if (array[i] == data) {
                for (int j = i; j < n - 1; j++) {
                    array[j] = array[j + 1];
                }
                n--;
                i--;
            }
        }
    }

    public boolean isExist(T data) {
        if (!isEmpty()) {
            for (int i = 0; i < n; i++) {
                if (array[i].equals(data)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void isContain(T data) {
        if (isEmpty()) {
            System.out.println("List is empty!");
        }
        if (isExist(data)) {
            System.out.println("List contains " + data);
        } else {
            System.out.println("List doesn't contain " + data);
        }
    }

    public int times(T data) {
        if (isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < size(); i++) {
            if (array[i] == data) {
                count++;
            }
        }
        return count;
    }

    public void positions(T data) {
        if (isEmpty()) {
            return;
        }
        if (isExist(data)) {
            System.out.print("Positions: ");
            for (int i = 0; i < n; i++) {
                if (array[i].equals(data)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

}
