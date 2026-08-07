
public class Labeled_Loop {

    public static void main(String[] args) {
        System.out.println("Labelled loops in Java  ");
        outer:
        for (int i = 1; i <= 3; i++) {
            inner:
            for (int j = 1; j <= 4; j++) {
                if (i == 2) {
                    break outer;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
