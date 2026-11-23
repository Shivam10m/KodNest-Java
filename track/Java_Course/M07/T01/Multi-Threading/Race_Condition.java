
class Race_Condition {

    static int count = 10;

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                count = count - 1;
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                count = count - 1;
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Final Count: " + count);

    }
}
