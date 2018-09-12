import java.util.NoSuchElementException;

public class MyArrayStack<Item> {
    private Item[] arr;
    private int size = 0;

    public MyArrayStack() {
        arr = (Item[]) new Object[1];
    }

    public void push(Item item) {
        if (size == arr.length) {
            resize(arr.length * 2);
        }
        arr[size++] = item;
    }

    public Item pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Item item = arr[size - 1];
        size--;
        if (size > 0 && size == arr.length / 4) {
            resize(arr.length / 2);
        }
        return item;
    }

    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return arr[size - 1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize(int cap) {
        Item[] temp = (Item[]) new Object[cap];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }
}
