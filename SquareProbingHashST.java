public class SquareProbingHashST<Key, Value> {
    private int M = 97;
    private int size = 0;
    private Key[] keys = (Key[]) new Object[M];
    private Value[] values = (Value[]) new Object[M];

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public void put(Key key, Value value) {
        if(key == null) {
            throw new IllegalArgumentException("Ключ не может быть равен null");
        }


        int hash = hash(key);
        int i = hash;
        int step = 1;
        for (; keys[i] != null; i = (hash + step * step) % M) {
            if(keys[i].equals((key))) {
                values[i] = value;
                return;
            }
            step++;
        }
        keys[i] = key;
        values[i] = value;
        size++;
    }

    public Value get (Key key) {
        if(key == null) {
            throw new IllegalArgumentException("Ключ не может быть равен null");
        }

        int hash = hash(key);
        int i = hash;
        int step = 1;
        for (; keys[i] != null; i = (hash + step * step) % M) {
            if(keys[i].equals((key))) {
                return values[i];
            }
            step++;
        }
        return null;
    }
}
