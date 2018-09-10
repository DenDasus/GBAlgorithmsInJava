public class MyPriorityQueue<Item extends Comparable> {
    private Item[] pq;
    private int size = 0;

    public MyPriorityQueue() {
        pq = (Item[]) new Object[1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return  size == 0;
    }

    public  void enqueue(Item item) {
        if(size == pq.length) {
            resize(pq.length * 2);
        }

        pq[size++] = item;
        int i = size - 1;
        while (i > 0 && pq[i].compareTo(pq[i - 1]) < 0) {
            Item tmp = pq[i];
            pq[i] = pq[i - 1];
            pq[i - 1] = tmp;
        }
    }

    public Item dequeue() {

    }

    public  Item firstElement() {

    }

    private void  resize(int capacity) {

    }
}
