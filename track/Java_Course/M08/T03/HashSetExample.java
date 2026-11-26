
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set set = new HashSet();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(50);
        System.out.println("Set elements: " + set);

        set.remove(30);
        System.out.println("Set elements: " + set);

        set.clear();
        System.out.println("Set elements: " + set);

        Set set2 = new HashSet();

        set2.add("Shivam");
        set2.add("Ravi");
        set2.add("Shivam");
        set2.add("Sachin");

        System.out.println("Set-2 elements: " + set2);
    }
}
