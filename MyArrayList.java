public class MyArrayList<Item extends Comparable> {
    private Object[] arr;
    private int size = 0;

    public MyArrayList() {
        arr = new Object[1];
    }

    private void resize(int cap) {
        Object[] tmp = new Object[cap];
        for (int i = 0; i < size; i++) {
            tmp[i] = arr[i];
        }
        arr = tmp;
    }

    public int size() {
        return size;
    }

    public Item get(int index) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return (Item) arr[index];
    }

    public void set(int index, Item item) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        arr[index] = item;
    }

    public void insert(Item item) {
        if(size == arr.length) {
            resize( arr.length *  2);
        }
        arr[size++] = item;
    }

    public boolean delete(Item item) {
        int i =0;
        while(!arr[i].equals(item) && i < size) {
            i++;
        }

        if (i == size) {
            return false;
        }
        for (int j = i; j < size - 1 ; j++) {
            arr[j] = arr[j + 1];
        }
        arr[size - 1] = null;
        size--;

        if(size > 0 && size == arr.length / 4)
        {
            resize(arr.length / 2);
        }

        return true;
    }

    public boolean find(Item item) {
        for (int i = 0; i < size; i++) {
            if(arr[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString()
    {
        String s = "";
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                s += arr[i] + ", ";
            } else {
                s += arr[i];
            }
        }

        return s;
    }

    private void exch(int index1, int index2) {
        Item tmp = (Item) arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    private boolean less (Item item1, Item item2) {
        return item1.compareTo(item2) < 0;
    }

    public void sortInsertion() {
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0 ; j--) {
                if(less((Item) arr[j], (Item) arr[j - 1])) {
                    exch(j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public void sortSelection() {
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if(less((Item)arr[j], (Item)arr[min])) {
                    min = j;
                }
            }
            exch(i, min);
        }
    }

    public void sortBubble() {
        for (int i = 1; i < size - 1; i++) {
            for (int j = 1; j < size - i; j++) {
                if(less((Item) arr[j + 1], (Item) arr[j])) {
                    exch(j, j + 1);
                }
            }
        }
    }

    public void sortBubbleWithCheck() {
        for (int i = 1; i < size - 1; i++) {
            boolean isExchanged = false;
            for (int j = 1; j < size - i; j++) {
                if(less((Item) arr[j + 1], (Item) arr[j])) {
                    exch(j, j + 1);
                    isExchanged = true;
                }
            }
            if(isExchanged == false) {
                break;
            }
        }
    }
}
