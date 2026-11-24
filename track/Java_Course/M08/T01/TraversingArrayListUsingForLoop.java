
import java.util.ArrayList;
import java.util.Scanner;

public class TraversingArrayListUsingForLoop {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scan.nextInt();

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int elem = scan.nextInt();
            list.add(elem);
        }

        System.out.println("Traversing ArrayList using For Loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
