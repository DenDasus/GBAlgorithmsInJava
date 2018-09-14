public class MyLinkedStack <Item> {
    private MyLinkedList<Item> stack = new MyLinkedList<>();

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(Item item) {
        stack.insertFirst(item);
    }

    public Item pop() {
        return stack.removeFirst();
    }

    public Item peek() {
        return stack.getFirst();
    }
}
