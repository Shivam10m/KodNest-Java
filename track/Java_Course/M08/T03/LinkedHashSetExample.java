
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        Set set1 = new LinkedHashSet();

        set1.add(10);
        set1.add(20);
        set1.add(20);
        set1.add(40);
        set1.add(50);
        System.out.println("Set-1 elements: " + set1);

        set1.remove(20);
        System.out.println("Set-1 elements: " + set1);

        set1.clear();
        System.out.println("Set-1 elements: " + set1);

        Set set2 = new LinkedHashSet();

        set2.add("Shivam");
        set2.add("Rohan");
        set2.add("Sachin");
        set2.add("Mayank");
        set2.add("Rohan");
    }
}
