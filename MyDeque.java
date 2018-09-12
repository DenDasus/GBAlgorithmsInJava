import java.util.NoSuchElementException;

public class MyDeque <Item>{
    private Item[] array;
    private int size = 0;
    private int head = 0;
    private int tail = 0;
    
    public MyDeque () {
        array = (Item[]) new Object[1];
    }
    
    public void pushBack(Item item) {

    }
    
    public Item popBack() {

    }
    
    public Item peekBack() {

    }
    
    public void pushFront(Item item) {
    
    }
    
    public Item popFront() {
    
    }
    
    public Item peekFront() {
    
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    private void resize(int cap) {

    }
}
