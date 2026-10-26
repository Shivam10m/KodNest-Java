
public class HAS_A1 {

    public static void main(String[] args) {
        System.out.println("Example of Composition (Strong) type HAS_A relationship");
        Mobile m = new Mobile();

        m.o.checkOS();
    }
}

class OS {

    OS() {
        System.out.println("OS is installed");
    }

    public void checkOS() {
        System.out.println("OS is still executing");
    }
}

class Mobile {

    OS o = new OS();

    Mobile() {
        System.out.println("OS is installed and Mobile is ON");
    }
}
