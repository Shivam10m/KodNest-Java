
public class Practice_2 {

    public static void main(String[] args) {
        int solvedProblems = 47;
        int practiceDays = 5;
        double exactPercentage = 86.75;

        // Type Casting Part
        double solvedProb = solvedProblems; // widening solvedProblems from int datatype to double datatype (implicit casting)
        int wholePercentage = (int) exactPercentage; // narrowing exactPercentage from double datatype to int datatype (explicit casting)
        double avgPerDay = solvedProb / practiceDays;
        boolean isAvg = avgPerDay > 9.0;

        System.out.println("Report Value: " + solvedProb);
        System.out.println("Whole Percentage: " + wholePercentage);
        System.out.println("Average Per Day: " + avgPerDay);
        System.out.println("Daily Target Reached: " + isAvg);
    }
}
