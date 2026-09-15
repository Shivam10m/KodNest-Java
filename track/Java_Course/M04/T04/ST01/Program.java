
public class Program {

    static int a;
    static int b;

    int p;
    int q;

    static {
        System.out.println("Static Block");
        a = 10;
        b = 20;
    }

    {
        System.out.println("Non-Static Block");
        p = 10;
        q = 20;
    }

    static void disp1() {
        System.out.println("Static Method");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    void disp2() {
        System.out.println("Non-Static Method");
        System.out.println("p = " + p);
        System.out.println("q = " + q);
    }

    public static void main(String[] args) {
        Program pg = new Program();
        Program.disp1();
        pg.disp2();
    }

}
