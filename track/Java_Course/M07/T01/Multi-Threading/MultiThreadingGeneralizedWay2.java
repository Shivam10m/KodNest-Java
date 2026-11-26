
public class MultiThreadingGeneralizedWay2 {

    public static void main(String[] args) {

        Activities add = new Activities();
        Activities chars = new Activities();
        Activities pn = new Activities();

        Thread t1 = new Thread(add);
        Thread t2 = new Thread(chars);
        Thread t3 = new Thread(pn);

        t1.setName("Add");
        t2.setName("Char");
        t3.setName("Num");

        t1.start();
        t2.start();
        t3.start();

    }
}

class Activities implements Runnable {

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
