
public class Interfaces {

    public static void main(String[] args) {
        Shape square = new Square();
        square.input();
        square.disp();
    }
}

interface Shape {

    void input();

    void disp();
}

class Square implements Shape {

    @Override
    public void input() {
        System.out.println("Input");
    }

    @Override
    public void disp() {
        System.out.println("display");
    }
}
