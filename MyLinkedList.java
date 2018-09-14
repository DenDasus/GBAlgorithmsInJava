import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<Item> implements Iterable<Item> {
    @Override
    public Iterator<Item> iterator() {
        return new MyLinkedListIterator();
    }

    class MyLinkedListIterator implements Iterator {
        Node current;

        MyLinkedListIterator() {
            current = new Node();
            current.item = null;
            current.next = first;
            current.prev = null;
        }

        @Override
        public boolean hasNext() {
            if(current == null) {
                return false;
            }
            return current.next != null;
        }

        @Override
        public Item next() {
            if(current == null) {
                return null;
            }

            if(!hasNext()) {
                return null;
            }

            current = current.next;
            return current.item;
        }
    }
    class Node {
        Item item;
        Node next;
        Node prev;
    }

    private Node first = null;
    private Node last = null;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public Item gotFirst() {
        return first.item;
    }

    public void insertFirst(Item item) {
        Node newFirst = new Node();
        newFirst.item = item;
        newFirst.next = first;

        if(size == 0) {
            last = newFirst;
        } else {
            first.prev = newFirst;
        }

        first = newFirst;
        size++;
    }

    public void insertLast(Item item) {
        Node newLast = new Node();
        newLast.item = item;
        if(size == 0) {
            newLast.prev = last;
            last = newLast;
            first = newLast;
        } else {
            last.next = newLast;
            newLast.prev = last;
            last = newLast;
        }

        size++;
    }

    public Item getFirst() {
        if(size == 0) {
            throw new NoSuchElementException();
        }
        return first.item;
    }

    public Item getLast() {
        if(size == 0) {
            throw new NoSuchElementException();
        }
        return last.item;
    }

    public Item get(int index) {
        if(index > size - 1) {
            throw new NoSuchElementException();
        }

        Node current = first;
        int i = 0;

        while(i < index) {
            current = current.next;
            i++;
        }
        return current.item;
    }

    public void insert(Item item, int index) {
        if(index > size) {
            throw new IndexOutOfBoundsException();
        } else if( index == size) {
            insertLast(item);
        } else if(index == 0) {
            insertFirst(item);
        } else {
            Node current = first;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            Node newNode = new Node();
            newNode.item = item;
            Node before = current.prev;

            newNode.prev = before;
            newNode.next = current;
            before.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public boolean find(Item item) {
        Node current = first;
        while(current != null) {
            if(current.item.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public Item remove(Item item) {
        Node current = first;

        while(current != null) {
            if(current.item.equals(item)) {
                Node before = current.prev;
                Node after = current.next;
                current.next = null;
                current.prev = null;
                if(before != null) {
                    before.next = after;
                } else {
                    first = after;
                }
                if(after != null) {
                    after.prev = before;
                } else {
                    last = before;
                }
                size--;
                return item;
            }
            current = current.next;
        }
      return null;
    }

    public Item removeFirst() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        Item item = first.item;

        if(first.next != null) {
            first = first.next;
            first.prev = null;
        } else {
            first = null;
            last = null;
        }
        size--;
        return item;
    }

    public Item removeLast() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        Item item = last.item;
        if(last.prev != null) {
            Node beforeLast = last.prev;
            last.prev = null;
            beforeLast.next = null;
            last = beforeLast;
        } else {
            first = null;
            last = null;
        }
        size--;
        return item;
    }

    @Override
    public String toString() {
        String s = "";
        Node curr = first;

        while(curr != null) {
            s = s + curr.item.toString() + " ";
            curr = curr.next;
        }
        return s;
    }
}
