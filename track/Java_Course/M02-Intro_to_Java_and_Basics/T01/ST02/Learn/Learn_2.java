
import java.util.Scanner;

class Learn_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Switch Statment in Java\n");
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
