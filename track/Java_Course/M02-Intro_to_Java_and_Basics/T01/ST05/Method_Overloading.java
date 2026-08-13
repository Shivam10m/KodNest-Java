
class Method_Overloading {

    public static void main(String[] args) {
        Addition al = new Addition();
        System.out.println("Method overloading in java happens if multiple methods have same name and follows any one of the below conditions: ");
        System.out.println("1. Number of parameters should be different");
        System.out.println("2. Datatype of the parameters should be different");
        System.out.println("3. Order of parameters should be different\n");
        System.out.println(al.add(10, 20));
        System.out.println(al.add(10, 30.5));
        System.out.println(al.add(21.5, 20));
        System.out.println(al.add(21.5, 21.5));
        System.out.println(al.add(20, 20, 21.5));
        System.out.println(al.add(20, 11.5, 11.5));
        System.out.println(al.add('A', 25));
    }
}

class Addition {

    int add(int a, int b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(int a, double b, double c) {
        return a + b + c;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}
