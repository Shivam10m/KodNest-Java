
public class DiffStatic_Non_Static {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
    }
}

class Demo {

    static {
        System.out.println("\nStatic Block");
    }

    {
        System.out.println("Non-Static Block-1");
    }

    {
        System.out.println("Non-Static Block-2");
    }
}
