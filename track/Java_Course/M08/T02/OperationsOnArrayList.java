
import java.util.ArrayList;
import java.util.List;

public class OperationsOnArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //Insert in ArrayList
        list.add("Java");
        list.add("Python");
        list.add("SQL");
        System.out.println(list);

        //Update element in ArrayList
        list.set(1, "HTML");
        System.out.println(list);

        System.out.println(list);
        //Remove element in ArrayList
        list.remove(2);
    }
}
