
public class Synchronized_Block {

    public static void main(String[] args) {
        Hospital h = new Hospital();

        Thread t1 = new Thread(h);
        Thread t2 = new Thread(h);

        t1.setName("Tom");
        t2.setName("Jerry");

        t1.start();
        t2.start();
    }
}

class Hospital implements Runnable {

    String res1 = "Chair";
    String res2 = "Doctor";

    @Override
    public void run() {
        try {
            String threadName = Thread.currentThread().getName();
            if (threadName.equals("Tom")) {
                tomTreatment();
            } else {
                jerryTreatment();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tomTreatment() {
        try {
            synchronized (res1) {
                System.out.println("Tom has occupied " + res1);
                Thread.sleep(3000);

                synchronized (res2) {
                    System.out.println("Tom has occupied " + res2);
                    Thread.sleep(3000);
                }
                System.out.println("Tom released " + res2);
                Thread.sleep(3000);
            }
            System.out.println("Tom released " + res1);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void jerryTreatment() {
        try {
            synchronized (res1) {
                System.out.println("Jerry has occupied " + res1);
                Thread.sleep(3000);

                synchronized (res2) {
                    System.out.println("Jerry has occupied " + res2);
                    Thread.sleep(3000);
                }
                System.out.println("Jerry released " + res2);
                Thread.sleep(3000);
            }
            System.out.println("Jerry released " + res1);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
