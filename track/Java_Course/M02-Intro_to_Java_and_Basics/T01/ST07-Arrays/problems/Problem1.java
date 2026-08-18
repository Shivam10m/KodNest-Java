
import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        System.out.println("Enter array Elements: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            arr[i] = scan.nextInt();
        }

        System.out.print("Array Elements: ");

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }

        System.out.println();
        System.out.println("Total: " + sum);
    }
}
