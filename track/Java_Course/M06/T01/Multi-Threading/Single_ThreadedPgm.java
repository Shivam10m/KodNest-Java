
import java.util.Scanner;

public class Single_ThreadedPgm {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value of a: ");
        int a = scan.nextInt();

        System.out.println("Enter number1: ");
        int num1 = scan.nextInt();

        System.out.println("Enter number2: ");
        int num2 = scan.nextInt();

        int res = num1 + num2;
        System.out.println("Additionof two number is: " + res);

    }
}
