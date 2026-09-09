
public class StringToCharConversion {

    public static void main(String[] args) {
        String str = "Programming";
        System.out.println(str);

        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }

        String str2 = new String(ch);
        System.out.println("\n" + str2);

    }
}
