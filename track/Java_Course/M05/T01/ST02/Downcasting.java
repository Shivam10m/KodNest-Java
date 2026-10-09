
class Parent {

    public void disp1() {
        System.out.println("Inside Parent disp1");
    }

    public void disp2() {
        System.out.println("Inside Parent disp2");
    }
}

class Child1 extends Parent {

    @Override
    public void disp2() {
        System.out.println("Inside Child1 disp2");
    }

    public void disp3() {
        System.out.println("Inside Child1 disp3");
    }
}

class Child2 extends Parent {

    @Override
    public void disp2() {
        System.out.println("Inside Child2 disp2");
    }

    public void disp3() {
        System.out.println("Inside Child2 disp3");
    }
}

public class Downcasting {

    public static void main(String[] args) {
        System.out.println("Learning Downcasting in Java");

        // Parent p = new Child1();
        // p.disp1();
        // p.disp2();
        // p.disp3(); this give error bcz in upcasting we can access only inherited, overridden methods
        // but disp3 is specialized method, so to access disp3 method using parent reference we have to use downcasting
        // ((Child1) (p)).disp3(); // downcasting
        Parent ch1 = new Child1();
        accessMethod(ch1);

        Parent ch2 = new Child2();
        accessMethod(ch2);
    }

    public static void accessMethod(Parent ref) {
        ref.disp1();
        ref.disp2();

        if (ref instanceof Child1) {
            ((Child1) ref).disp3();
        } else {
            ((Child2) (ref)).disp3();
        }
    }
}
