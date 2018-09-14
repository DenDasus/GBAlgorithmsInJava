public class MyLinkedQueue<Item> {
    private MyLinkedList<Item> queue = new MyLinkedList<>();

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void enqueue(Item item) {
        queue.insertLast(item);
    }

    public Item dequeue() {
        return queue.removeFirst();
    }

    public Item peek() {
        return queue.getFirst();
    }
}
