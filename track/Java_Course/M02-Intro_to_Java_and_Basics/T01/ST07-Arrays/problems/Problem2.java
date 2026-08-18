
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter array Elements: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter Element to check frequency: ");
        int target = scan.nextInt();
        Frequency fs = new Frequency();
        int count = fs.count(arr, target);

        System.out.println(target + ": " + count);
    }
}
