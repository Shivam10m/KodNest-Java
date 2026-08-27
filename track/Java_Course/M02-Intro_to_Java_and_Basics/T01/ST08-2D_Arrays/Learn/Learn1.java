
import java.util.Scanner;

public class Learn1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Learning 2D arrays in java");

        System.out.print("Enter Number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter Number of columns: ");
        int cols = scan.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter row " + (i + 1) + " column " + (j + 1) + " element: ");
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
