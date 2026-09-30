
class Program1 {

    private int a = 10;

    public void display() {
        System.out.println("Program1: " + a);
    }

}

class Program2 extends Program1 {

}

public class Program {

    public static void main(String[] args) {
        Program2 pg2 = new Program2();
        pg2.display();
    }

}
