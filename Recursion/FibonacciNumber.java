package Recursion;

// This class calculates the nth Fibonacci number using recursion
public class FibonacciNumber {

    // This method returns the Fibonacci number at position n
    // Example: calFibonacci(5) = 5, because the sequence is: 0 1 1 2 3 5 ...
    static int calFibonacci(int n) {
        // Base case: the 0th Fibonacci number is 0
        if (n == 0) return 0;

        // Base case: the 1st Fibonacci number is 1
        if (n == 1) return 1;

        // Recursive call:
        // fib(n) = fib(n - 1) + fib(n - 2)
        int fiboOfN_1 = calFibonacci(n - 1); // calculate fib(n-1)
        int fiboOfN_2 = calFibonacci(n - 2); // calculate fib(n-2)

        // Add the two previous numbers to get the current Fibonacci number
        return fiboOfN_1 + fiboOfN_2;
    }

    public static void main(String[] args) {
        // We want to find the 25th Fibonacci number
        int n = 25;

        // Call the function and print the result
        System.out.println(calFibonacci(n)); // Output: 75025
    }
}

