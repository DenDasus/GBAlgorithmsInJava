import java.util.Iterator;

public class lesson4 {
    public static void main(String[] args) {
        MyLinkedList<Integer> mll = new MyLinkedList();
        mll.insertFirst(1);
        mll.insertFirst(4);
        mll.insertLast(7);
        System.out.println(mll);
        System.out.println(mll.find(5));
        System.out.println(mll.find(7));
        mll.insertLast(10);
        mll.insertFirst(8);
        System.out.println(mll);

        //Test iterator
        Iterator<Integer> iter = mll.iterator();

        String s = "";
        while(iter.hasNext()) {
            s = s + iter.next() + ", ";
        }

        System.out.println(s);

        System.out.println(mll.getFirst());
        System.out.println(mll.getLast());
        System.out.println(mll.get(3));
        mll.removeFirst();
        System.out.println(mll);
        mll.removeLast();
        System.out.println(mll);
        mll.remove(1);
        mll.remove(4);
        mll.removeFirst();
        System.out.println(mll);

    }
}
