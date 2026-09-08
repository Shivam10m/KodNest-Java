
public class StringComparison {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Shiva");
        String s4 = new String("ShivA");
        if (s1 == s2) {
            System.out.println("Reference is same.");
        } else {
            System.out.println("Reference is not same.");
        }

        if (s1.equals(s2)) {
            System.out.println("Reference is same.");
        } else {
            System.out.println("Reference is not same.");
        }

        if (s3.equals(s4)) {
            System.out.println("Reference is same.");
        } else {
            System.out.println("Reference is not same.");
        }

        if (s3.equalsIgnoreCase(s4)) {
            System.out.println("Reference is same.");
        } else {
            System.out.println("Reference is not same.");
        }
    }
}
