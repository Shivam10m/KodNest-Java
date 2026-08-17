
import java.util.Scanner;

public class Array1 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Way 1 of declaring array
        int[] arr = new int[5];

        // Way 2 of declaring array
        int arr1[] = {10, 20, 30, 40, 50};

        // Way 3 of declaring array
        int[] arr2 = new int[4];

        System.out.println("Enter array Elements: ");
        arrayInput(arr);

        System.out.println("\nArray Elements: ");
        printArray(arr);

        System.out.println("\nArray Elements: ");
        printArray(arr1);

        System.out.println("\nArray Elements: ");
        printArray(arr2);

    }

    public static void arrayInput(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = scan.nextInt();
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
