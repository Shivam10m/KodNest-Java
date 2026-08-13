
public class Shadowing {

    public static void main(String[] args) {
        System.out.println("Learning Shadowing in java");
        System.out.println("this keyword refers the currently accessed or executing object");
        System.out.println("this Keyword cannot be used inside the static method because static method belongs to class and does not refer to any object");
        Student s1 = new Student();
        s1.input("Raja", 18, 5.5);
        s1.display();
    }
}

class Student {

    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("height: " + height);
    }
}
