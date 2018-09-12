import java.util.Random;

public class AlgorithmsLesson2HW {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        list.insert(4);
        list.insert(9);
        list.insert(25);

        System.out.println(list);
        System.out.println(list.find(9));
        System.out.println(list.find(10));
        System.out.println(list.size());

        list.set(1, 10);

        System.out.println(list.find(9));
        System.out.println(list.find(10));
        System.out.println(list.get(2));

        list.insert(7);
        list.insert(14);

        System.out.println(list.size());
        System.out.println(list);

        list.delete(25);

        System.out.println(list.size());
        System.out.println(list);

        Random rand = new Random();
        MyArrayList<Integer> bigList1 = new MyArrayList<>();
        MyArrayList<Integer> bigList2 = new MyArrayList<>();
        MyArrayList<Integer> bigList3 = new MyArrayList<>();
        MyArrayList<Integer> bigList4 = new MyArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            int data = rand.nextInt(Integer.MAX_VALUE);
            bigList1.insert(data);
            bigList2.insert(data);
            bigList3.insert(data);
            bigList4.insert(data);
        }

        long t1, t2;

        t1 = System.currentTimeMillis();
        bigList1.sortSelection();
        t2 = System.currentTimeMillis();
        System.out.println("Selection sort: " + (t2 - t1) + " ms");

        t1 = System.currentTimeMillis();
        bigList2.sortInsertion();
        t2 = System.currentTimeMillis();
        System.out.println("Insertion sort: " + (t2 - t1) + " ms");

        t1 = System.currentTimeMillis();
        bigList3.sortBubble();
        t2 = System.currentTimeMillis();
        System.out.println("Bubble sort: " + (t2 - t1) + " ms");

        t1 = System.currentTimeMillis();
        bigList4.sortBubbleWithCheck();
        t2 = System.currentTimeMillis();
        System.out.println("Bubble sort with exchange check: " + (t2 - t1) + " ms");
    }
}
