
import java.util.Scanner;

public class LinearSearch {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ArraySearch as = new ArraySearch();
        int[] arr = new int[5];

        System.out.println("Enter array Elements: ");
        arrayInput(arr);

        System.out.println("\nArray Elements: ");
        printArray(arr);

        System.out.print("\nEnter Element you want to find: ");
        int key = scan.nextInt();
        boolean isFound = false;

        if (!(as.search(arr, key, isFound))) {
            System.out.println("Element not found");
        }

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
