public class lesson3 {

    public static void main(String[] args) {
        MyArrayStack<Integer> stack = new MyArrayStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        MyQueue<Character> q = new MyQueue<>();
        q.enqueue('a');
        q.enqueue('b');
        q.enqueue('c');
        q.enqueue('d');

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        q.enqueue('e');
        q.enqueue('f');
        q.enqueue('g');
        q.enqueue('h');
        q.enqueue('i');
        q.enqueue('j');
        q.enqueue('k');

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }

}
