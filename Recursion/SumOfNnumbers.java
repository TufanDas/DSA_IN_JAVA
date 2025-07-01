package Recursion;

// This class calculates the sum of the first n natural numbers using recursion
public class SumOfNnumbers {

    // This method returns the sum of numbers from n to 1
    // For example: sumOfN_naturalNumbers(5) = 5 + 4 + 3 + 2 + 1 = 15
    static int sumOfN_naturalNumbers(int n) {
        // Base case: if n is 0, we stop and return 0 (no more numbers to add)
        if (n == 0) return 0;

        // Recursive step: add current number (n) to the sum of numbers before it
        return n + sumOfN_naturalNumbers(n - 1);
    }

    public static void main(String[] args) {
        // Choose the number n you want to find the sum for
        int n = 5;

        // Call the method and print the result
        System.out.println("Sum of " + n + " is : " + sumOfN_naturalNumbers(n));
    }
}
