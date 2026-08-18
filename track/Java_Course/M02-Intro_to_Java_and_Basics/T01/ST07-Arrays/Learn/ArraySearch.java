
public class ArraySearch {

    public boolean search(int[] arr, int key, boolean isFound) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        return isFound;
    }
}
