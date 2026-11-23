
public class MultiThreadingGeneralizedWay1 {

    public static void main(String[] args) {

        Activities add = new Activities();
        Activities chars = new Activities();
        Activities pn = new Activities();

        add.setName("Add");
        chars.setName("Char");
        pn.setName("Num");

        add.start();
        chars.start();
        pn.start();

    }
}

class Activities extends Thread {

    int num1 = 55;
    int num2 = 29;
    char ch = 'J';
    int num3 = 5;

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("Add")) {
            add();
        } else if (threadName.equals("Char")) {
            printChar();
        } else {
            printNum();
        }
    }

    void add() {
        System.out.println("Addition: " + (num1 + num2));
    }

    void printChar() {
        System.out.println("Characters: ");
        for (int i = 'A'; i <= ch; i++) {
            System.out.println((char) i);
        }
    }

    void printNum() {
        System.out.println("Numbers: ");
        for (int i = 1; i <= num3; i++) {
            System.out.println(i);
        }
    }
}
