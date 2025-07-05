// Computes nth Fibonacci number recursively
public class FibonacciRecursion {
    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    }
}
