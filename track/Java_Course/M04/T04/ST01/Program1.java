
public class Program1 {

    static int a;
    int b;

    static {
        System.out.println("Static Block");
        a = 10;
    }

    public void display() {
        System.out.println("Non-Static Method");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        Program1 pg1 = new Program1();
        pg1.display();

        Program1 pg2 = new Program1();
        pg2.display();
    }

}
