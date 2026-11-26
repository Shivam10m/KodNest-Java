
import java.util.*;

public class RemoveMethod {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);

        list.remove(Integer.valueOf(20)); // This is possible bcz of method overloading but we have to provide 
        // this Integer.valueOf(20) when we want to remove any element from list using value.
        System.out.println(list);
        list.remove(4);
        System.out.println(list);

    }
}
