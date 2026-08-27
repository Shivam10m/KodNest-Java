
import java.util.Scanner;

public class Learn2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Learning 3D arrays in java");

        System.out.print("Enter Number of layers: ");
        int layers = scan.nextInt();

        System.out.print("Enter Number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter Number of columns: ");
        int cols = scan.nextInt();

        System.out.println();

        int[][][] arr = new int[layers][rows][cols];

        for (int layer = 0; layer < arr.length; layer++) {
            for (int i = 0; i < arr[layer].length; i++) {
                for (int j = 0; j < arr[layer][i].length; j++) {
                    System.out.print("Enter Layer " + (layer + 1) + " row " + (i + 1) + " column " + (j + 1) + " element: ");
                    arr[layer][i][j] = scan.nextInt();
                }
            }
            System.out.println();
        }

        for (int layer = 0; layer < arr.length; layer++) {
            System.out.println("Layer " + (layer + 1) + ": ");
            for (int i = 0; i < arr[layer].length; i++) {
                for (int j = 0; j < arr[layer][i].length; j++) {
                    System.out.print(arr[layer][i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
