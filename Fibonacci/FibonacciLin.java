package Fibonacci;

public class FibonacciLin {
    public static long fib(int n) {
        if (n <= 2) {
            return 1;
        }
        long[] nums = new long[n];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n - 1];
    }
}
