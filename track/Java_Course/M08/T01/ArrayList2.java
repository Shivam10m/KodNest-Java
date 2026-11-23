
import java.util.ArrayList;

public class ArrayList2 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(200);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.contains(600));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println((Integer) list.get(2));
        System.out.println(list.indexOf(200));
        System.out.println((Integer) list.lastIndexOf(200));
        System.out.println(list);

        ArrayList list2 = new ArrayList();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);

        list.addAll(list2);
        System.out.println(list);

        list.clear();

    }
}
