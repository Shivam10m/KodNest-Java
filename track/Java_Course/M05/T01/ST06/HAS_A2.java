
public class HAS_A2 {

    public static void main(String[] args) {
        System.out.println("Example of Aggregate (Weak) type HAS_A relationship");
        Charger c = new Charger();
        Mobile m = new Mobile(c);
        m.hasA();
        c.getCharger();

        m = null; //destroying nobile class
        //m.hasA(); will give null pointer exception
        c.getCharger();

    }
}

class Charger {

    Charger() {
        System.out.println("Charger is created");
    }

    public void getCharger() {
        System.out.println("Charger is used for Charging...");
    }
}

class Mobile {

    Charger c;

    Mobile(Charger c) {
        this.c = c;
        System.out.println("Mobile is created");
    }

    void hasA() {
        c.getCharger();
    }
}
