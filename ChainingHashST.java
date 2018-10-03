public class ChainingHashST<Key, Value> {
    private int M = 97;
    private int size = 0;
    private Node[] st = (Node[]) new Object[M];
    private class Node {
        private Key key;
        private  Value value;
        private Node next;

        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public int size() {

    }

    public boolean isEmpty() {

    }

    public void put(Key key, Value value) {

    }

    public Value get(Key key) {

    }
}
