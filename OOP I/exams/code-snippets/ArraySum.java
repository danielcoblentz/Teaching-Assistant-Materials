// Creates an array and prints the sum of its elements
public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of array: " + sum);
    }
}
