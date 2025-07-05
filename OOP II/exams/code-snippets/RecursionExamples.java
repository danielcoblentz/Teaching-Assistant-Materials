// Recursion Examples: Factorial, Fibonacci, and Sum

public class RecursionExamples {

    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int recursiveSum(int n) {
        if (n == 0)
            return 0;
        return n + recursiveSum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Fibonacci of 6: " + fibonacci(6));
        System.out.println("Sum from 1 to 5: " + recursiveSum(5));
    }
}
