import java.util.NoSuchElementException;

public class MyDeque<Item> {
    private Item[] array;
    private int size = 0;
    private int head = 0;
    private int tail = 0;

    public MyDeque() {
        array = (Item[]) new Object[1];
    }

    public void pushBack(Item item) {
        if (size == array.length) {
            resize(array.length * 2);
        }
        tail = (tail - 1 + array.length) % array.length;
        array[tail] = item;
        size++;
    }

    public Item popBack() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (size > 0 && size == array.length / 4) {
            resize(array.length / 2);
        }

        Item item = array[tail];
        array[tail] = null;
        tail = (tail + 1) % array.length;
        size--;

        return item;
    }

    public Item peekBack() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return array[tail];
    }

    public void pushFront(Item item) {
        if (size == array.length) {
            resize(array.length * 2);
        }
        array[head] = item;
        head = (head + 1) % array.length;
        size++;
    }

    public Item popFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (size > 0 && size == array.length / 4) {
            resize(array.length / 2);
        }

        head = (head - 1 + array.length) % array.length;
        Item item = array[head];
        array[head] = null;
        size--;

        return item;
    }

    public Item peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Item item = array[(head - 1 + array.length) % array.length];
        return item;
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
            temp[i] = array[tail];
            tail = (tail + 1) % array.length;
        }
        array = temp;
        tail = 0;
        head = size;
    }
}
