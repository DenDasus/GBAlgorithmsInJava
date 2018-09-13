import java.util.NoSuchElementException;

public class MyPriorityQueue<Item extends Comparable> {
    private Object[] pq;
    private int size = 0;

    public MyPriorityQueue() {
        pq = new Object[1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(Item item) {
        if (size == pq.length) {
            resize(pq.length * 2);
        }

        pq[size++] = item;
        int i = size - 1;
        while (i > 0 && ((Item) pq[i]).compareTo((Item) pq[i - 1]) < 0) {
            Object tmp = pq[i];
            pq[i] = pq[i - 1];
            pq[i - 1] = tmp;
            i--;
        }
    }

    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Item item = (Item) pq[size - 1];
        pq[size - 1] = null;
        size--;
        if (size > 0 && size == pq.length / 4) {
            resize(pq.length / 2);
        }
        return item;
    }

    public Item firstElement() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (Item) pq[size - 1];
    }

    private void resize(int capacity) {
        Object[] temp = new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = pq[i];
        }
        pq = temp;
    }
}
