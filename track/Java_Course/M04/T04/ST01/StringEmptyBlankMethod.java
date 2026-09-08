
public class StringEmptyBlankMethod {

    public static void main(String[] args) {
        String str1 = "Shiva";
        System.out.println(str1.isBlank());
        System.out.println(str1.isEmpty());

        String str2 = " ";
        System.out.println(str2.isBlank());
        System.out.println(str2.isEmpty());

        String str3 = "";
        System.out.println(str3.isBlank());
        System.out.println(str3.isEmpty());

    }
}
