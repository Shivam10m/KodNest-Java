
import java.util.Scanner;

public class MultipleThreadsUsingRunnable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scan.nextInt();

        System.out.print("Enter any Char: ");
        char ch = scan.next().charAt(0);

        Addition add = new Addition(num1, num2);

        PrintChar chars = new PrintChar(ch);

        PrintNumber pn = new PrintNumber();

        Thread t1 = new Thread(add);
        Thread t2 = new Thread(chars);
        Thread t3 = new Thread(pn);

        t1.start();
        t2.start();
        t3.start();

    }
}

class Addition implements Runnable {

    int num1;
    int num2;

    Addition(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        int res = num1 + num2;
        System.out.println("Addition of num is: " + res);
    }
}

class PrintChar implements Runnable {

    char ch;

    PrintChar(char ch) {
        this.ch = ch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("Characters: ");
        for (int i = 'A'; i <= ch; i++) {
            System.out.println((char) i);
        }
    }
}

class PrintNumber implements Runnable {

    int num = 5;

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        System.out.println("Printing Numbers: ");
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
