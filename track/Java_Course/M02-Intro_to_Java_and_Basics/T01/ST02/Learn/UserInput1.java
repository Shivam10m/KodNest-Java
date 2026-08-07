
import java.util.Scanner;

public class UserInput1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Reading Byte value
        System.out.print("Enter Byte Value : ");
        byte a = scan.nextByte();
        System.out.println("Byte Value is: " + a + "\n");

        // Reading Short Value
        System.out.print("Enter Short Value : ");
        short b = scan.nextByte();
        System.out.println("Short Value is: " + b + "\n");

        // Reading Integer Value
        System.out.print("Enter Integer Value : ");
        int c = scan.nextInt();
        System.out.println("Integer Value is: " + c + "\n");

        // Reading Long Value
        System.out.print("Enter Long Value : ");
        long d = scan.nextLong();
        System.out.println("Long Value is: " + d + "\n");

        // Reading Float Value
        System.out.print("Enter Float Value : ");
        float e = scan.nextFloat();
        System.out.println("Float Value is: " + e + "\n");

        // Reading Double Value
        System.out.print("Enter Double Value : ");
        double f = scan.nextDouble();
        System.out.println("Double Value is: " + f + "\n");

        // Reading Boolean Value
        System.out.print("Enter Boolean Value : ");
        boolean g = scan.nextBoolean();
        System.out.println("Boolean Value is: " + g + "\n");

        // Reading Word
        System.out.print("Enter Word Value : ");
        String word = scan.next();
        System.out.println("Word Value is: " + word + "\n");

        // TO prevent default behaviour of nextLine Method
        scan.nextLine();

        // Reading Sentence
        System.out.print("Enter Sentence : ");
        String sentence = scan.nextLine();
        System.out.println("Sentence is: " + sentence + "\n");

        // Reading Single character
        System.out.print("Enter Name : ");
        char ch = scan.next().charAt(2);
        System.out.println("Character is: " + ch + "\n");
    }
}
