
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        System.out.println("Element of list are: " + ll);

        ll.addFirst(99);
        ll.addLast(100);
        System.out.println("Element of list are: " + ll);

        ll.removeLast();
        System.out.println("Element of list are: " + ll);
    }
}
