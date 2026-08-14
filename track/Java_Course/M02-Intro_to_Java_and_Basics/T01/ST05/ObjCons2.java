
public class ObjCons2 {

    public static void main(String[] args) {
        Student s1 = new Student("Shivam", 22, 5.10);
        s1.display();

    }
}

class Student {

    String name;
    int age;
    double height;

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}
