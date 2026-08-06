
public class Practice_3 {

    public static void main(String[] args) {
        int day = 6;

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.err.println("Learning Day");
                break;
            case 6:
            case 7:
                System.err.println("Revision Day");
                break;
            default:
                System.err.println("Invalid Day");
        }
    }
}
