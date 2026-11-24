
import java.util.ArrayList;

public class ArrayList_In_Java {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        al.add("Hello");
        al.add("Java");
        al.add('c');
        al.add(true);
        al.add(23.5);
        al.addFirst(5);
        al.addLast(99);
        System.out.println(al);

        System.out.println(al.get(6));
        System.out.println(al.get(8));
        System.out.println(al.get(9));
        System.out.println(al);

    }
}
