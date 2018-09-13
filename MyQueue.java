import java.util.NoSuchElementException;

public class MyQueue<Item> {
    private Item[] queue;
    private int size = 0;
    private int first = 0;
    private int last = 0;

    public MyQueue() {
        queue = (Item[]) new Object[2];
    }

    public void enqueue(Item item) {
        if (size == queue.length) {
            resize(queue.length * 2);
        }
        queue[last] = item;
        last = (last + 1) % queue.length;
        size++;
    }

    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Item item = queue[first];
        queue[first] = null;
        size--;
        first = (first + 1) % queue.length;
        if (size > 0 && size == queue.length / 4) {
            resize(queue.length / 2);
        }
        return item;
    }

    public Item firstElement() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue[first];
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
            temp[i] = queue[(i + first) % queue.length];
        }
        queue = temp;
        first = 0;
        last = size;
    }
}
