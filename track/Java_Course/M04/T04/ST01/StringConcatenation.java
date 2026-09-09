
public class StringConcatenation {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Programming";

        String str1 = s1 + " " + s2;
        String str2 = s1.concat(" ").concat(s2);

        System.out.println(str1);
        System.out.println(str2);
    }
}
