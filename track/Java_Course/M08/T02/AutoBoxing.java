
import java.util.*;

public class AutoBoxing {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // While adding element into collection AutoBoxing Takes place automatically
        // Java internally converts primitive datatype into its corresponding wrapper class, this process is called autoboxing
        // list.add((Integer) 10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        // While retrieving element from collection UnBoxing Takes place automatically
        // Java internally converts wrapper class into its corresponding primitive datatype, this process is called autoboxing
        // int elem1 = (int) list.get(0);
        int elem1 = list.get(0);
        System.out.println("element 1: " + elem1);
    }
}
