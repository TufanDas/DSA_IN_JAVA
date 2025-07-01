package Recursion;

// This class calculates the factorial of a number using recursion
public class FactorialOfN {

    // This method calculates factorial of a number n
    // For example: factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    static int factorial(int n) {
        // Base case: factorial of 0 is 1 (by definition)
        if (n == 0) {
            return 1;
        }

        // Recursive case: multiply n by factorial of (n - 1)
        // This keeps calling itself until n reaches 0
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // Set the number for which we want to calculate factorial
        int n = 5;

        // Call the factorial method and print the result
        System.out.println("Factorial of " + n + " is : "+factorial(n)); // Output: 120
    }
}
