
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

    public static void main(String[] args) {
        Deque dq = new ArrayDeque();

        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40); // throws IllegalStateException if insertion fails
        dq.offer(50); // gives false if insertion fails

        System.out.println(dq);

        dq.addFirst(99);
        dq.addLast(99);

        dq.offerFirst(20);
        dq.offerLast(30);

        System.out.println(dq);

        dq.remove();// throws NoSuchElementException if deque is empty
        dq.poll(); // gives null if deque is empty

        System.out.println(dq);

        System.out.println("Front Element:" + dq.peek());
        System.out.println("Last Element:" + dq.peekLast());
    }
}
