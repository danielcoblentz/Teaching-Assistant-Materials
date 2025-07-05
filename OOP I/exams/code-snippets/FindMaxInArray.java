// Finds the largest number in an array
public class FindMaxInArray {
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {4, 9, 2, 11, 7};
        System.out.println("Max: " + findMax(nums));
    }
}
