
public class Practice_3 {

    public static void main(String[] args) {
        double principal = 10000.0;
        float rate = 6.5f;
        float time = 2.0f;
        double simpleInterest = (principal * rate * time) / 100.0;
        double totalAmount = principal + simpleInterest;

        double weight = 7.2f;
        double height = 1.8f;
        double bmi = weight / (height * height);

        int sub1 = 78;
        int sub2 = 84;
        int sub3 = 69;
        int sub4 = 91;
        int sub5 = 88;
        int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = (totalMarks * 100) / 500;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Toatl Amount: " + totalAmount);
        System.out.println("BMI: " + bmi);
        System.out.println("TotalMarks: " + totalMarks);
        System.out.println("Percentage: " + percentage);

    }
}
