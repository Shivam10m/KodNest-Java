
public class Main1 {

    public static void main(String[] args) {
        Child1 c = new Child1();
        c.disp1();
        c.disp2();
        c.disp3();
    }

}

class Parent {

    void disp1() {
        System.out.println("Inside parent disp1");
    }

    void disp2() {
        System.out.println("Inside parent disp2");
    }
}

class Child1 extends Parent {

    // disp1() and disp2() both methods are inherited form parent class so this methods called inherited method
    // disp3() is the childs individual methods so it is called specialized methods 
    @Override
    void disp2() {
        System.out.println("Inside child disp2");
    }

    void disp3() {
        System.out.println("Inside child disp3");
    }
}
