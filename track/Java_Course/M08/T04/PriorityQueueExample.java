
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.add(10);
        pq.offer(30);
        pq.offer(99);
        pq.offer(2);
        pq.offer(200);
        pq.offer(4);
        pq.offer(45);
        pq.offer(45);

        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}
