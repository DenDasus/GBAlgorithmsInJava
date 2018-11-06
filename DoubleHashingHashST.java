public class DoubleHashingHashST<Key, Value> {
    private int M = 97;
    private int num = 13;
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
    private int hash2(int hash1) {
        return num - (hash1 % num);
    }

    public void put(Key key, Value value) {
        if(key == null) {
            throw new IllegalArgumentException("Ключ не может быть равен null");
        }

        int i = hash(key);
        int step = hash2(i);
        for (; keys[i] != null; i = (i + step) % M) {
            if(keys[i].equals((key))) {
                values[i] = value;
                return;
            }
        }
        keys[i] = key;
        values[i] = value;
        size++;
    }

    public Value get (Key key) {
        if(key == null) {
            throw new IllegalArgumentException("Ключ не может быть равен null");
        }

        int i = hash(key);
        int step = hash2(i);
        for (; keys[i] != null; i = (i + step) % M) {
            if(keys[i].equals((key))) {
                return values[i];
            }
        }
        return null;
    }
}
