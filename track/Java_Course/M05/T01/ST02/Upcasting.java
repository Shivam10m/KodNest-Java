
class Developer {

    public void work() {
        System.out.println("Developer is Working");
    }

    public void project() {
        System.out.println("Developer is Building Project");
    }
}

class JavaDeveloper extends Developer {

    @Override
    public void work() {
        System.out.println("Java Developer is Working");
    }

    @Override
    public void project() {
        System.out.println("Java Developer is Building Java Project");
    }
}

class PythonDeveloper extends Developer {

    @Override
    public void work() {
        System.out.println("Python Developer is Working");
    }

    @Override
    public void project() {
        System.out.println("Python Developer is Building Python Project");
    }
}

public class Upcasting {

    public static void main(String[] args) {
        System.out.println("Learning Polymorphism in java");
        System.out.println("Two things are required to achieve polymorphism: Method Overriding And upcasting");
        Developer dev1 = new JavaDeveloper();
        accessMethod(dev1);

        Developer dev2 = new PythonDeveloper();// upcasting
        accessMethod(dev2);
    }

    public static void accessMethod(Developer dev) {
        dev.work();
        dev.project();
    }
}
