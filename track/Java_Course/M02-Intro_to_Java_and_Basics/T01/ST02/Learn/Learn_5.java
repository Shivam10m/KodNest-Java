
public class Learn_5 {

    public static void main(String[] args) {
        System.out.println("Nested While Loop");

        int i = 0;
        while (i <= 5) {

            int j = 1;
            while (j <= 5) {
                System.out.println(j);
                j++;
            }

            System.out.println("");
            i++;
        }
    }
}
