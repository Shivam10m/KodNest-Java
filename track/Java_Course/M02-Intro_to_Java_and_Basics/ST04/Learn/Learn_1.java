
public class Learn_1 {

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.rollNum = 101;
        s1.name = "Shivam";
        s1.height = 5.10;

        System.out.println(s1.rollNum);
        System.out.println(s1.name);
        System.out.println(s1.height);

        s1.run();
        s1.sleep();
    }
}

class Student {

    int rollNum;
    String name;
    double height;

    void run() {
        System.out.println("Student is Running");
    }

    void sleep() {
        System.out.println("Student is Sleeping");
    }
}
