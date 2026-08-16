
public class TypeCasting {

    public static void main(String[] args) {
        int num1 = 29;
        int num2 = 4;
        double res1 = (double) num1 / num2;
        System.out.println("\nResult of integer division with type casting: " + res1);

        double res2 = (double) (num1 / num2);
        System.out.println("Result of integer division with type casting with precedence change: " + res2 + "\n");

    }
}
