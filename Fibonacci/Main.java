package Fibonacci;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        int n = 45;

        Date linearTimeStart = new Date();
        long linearRes = FibonacciLin.fib(n);
        Date linearTimeEnd = new Date();
        System.out.println("Linear result " + linearRes);
        long linearDuration = linearTimeEnd.getTime() - linearTimeStart.getTime();
        System.out.println("Linear duration " + linearDuration);

        Date recursiveTimeStart = new Date();
        long recursiveRes = FibonacciRec.fib(n);
        Date recursiveTimeEnd = new Date();
        System.out.println("Recursive result " + recursiveRes);
        long recursiveDuration = recursiveTimeEnd.getTime() - recursiveTimeStart.getTime();
        System.out.println("Recursion duration " + recursiveDuration);
    }

}