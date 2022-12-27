package Fibonacci;

public class FibonacciRec {
    public static long fib(int n) {
        if (n <= 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
