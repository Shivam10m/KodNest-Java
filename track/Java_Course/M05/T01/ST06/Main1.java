
public class Main1 {

    public static void main(String[] args) {
        Person person = new Person();
    }
}

class Heart {

    Heart() {
        System.out.println("Heart is Beating");
    }

}

class Person {

    Heart heart = new Heart();

    Person() {
        System.out.println("Person is alive");
    }
}
