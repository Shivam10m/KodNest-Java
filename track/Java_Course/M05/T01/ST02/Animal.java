
public class Animal {

    String name = "Monkey";

    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.display();
    }
}

class Monkey extends Animal {

    public void display() {
        System.out.println("Animal name: " + name);
    }
}
