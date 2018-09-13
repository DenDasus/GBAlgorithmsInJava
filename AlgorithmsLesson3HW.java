public class AlgorithmsLesson3HW {

    public static void main(String[] args) {
        // Task 2
        String str1 = "Hello, world!";
        MyArrayStack<Character> stack = new MyArrayStack<>();

        for (int i = 0; i < str1.length(); i++) {
            stack.push(str1.charAt(i));
        }

        String str2 = "";
        while (!stack.isEmpty()) {
            str2 = str2 + stack.pop();
        }

        System.out.println(str2);


        // Task 3
        MyDeque<Integer> deque = new MyDeque<>();

        deque.pushFront(0);
        deque.pushFront(1);
        deque.pushFront(2);
        deque.pushBack(55);
        deque.pushBack(66);
        int item1 = deque.peekBack();
        int item2 = deque.peekFront();

        deque.pushBack(77);
        deque.pushFront(3);
        deque.pushBack(88);
        deque.pushBack(99);

        int item3 = deque.popBack();
        int item4 = deque.popFront();
        int item5 = deque.popBack();
        int item6 = deque.popFront();
        int item7 = deque.popBack();
        int item8 = deque.popFront();

//        MyPriorityQueue<Integer> pq = new MyPriorityQueue<>();
//        pq.enqueue(6);
//        pq.enqueue(7);
//        pq.enqueue(2);
//        pq.enqueue(3);
//
//        int item1 = pq.dequeue();
//        int item2 = pq.dequeue();
    }

}
