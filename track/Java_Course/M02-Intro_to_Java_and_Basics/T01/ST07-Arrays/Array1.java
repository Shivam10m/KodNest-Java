
import java.util.Scanner;

public class Array1 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] copyArr = new int[arr.length];

        System.out.println("Enter array Elements: ");
        arrayInput(arr);

        System.out.println("\nArray Elements: ");
        printArray(arr);

        System.out.println("\n\nArray in Reverse Order: ");
        printReversedArray(arr);

        System.out.println("Copying array: ");
        copyArray(arr, copyArr);
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

    public static void printReversedArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] copyArray(int[] arr, int[] copyArr) {
        int j = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            copyArr[j] = arr[i];
            j++;
        }
        return copyArr;
    }

}
