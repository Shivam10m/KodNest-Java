
public class Frequency {

    public int count(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}
