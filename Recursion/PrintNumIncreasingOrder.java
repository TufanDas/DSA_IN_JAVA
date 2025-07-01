package Recursion;

// This class prints numbers from 1 to 10 using recursion
public class PrintNumIncreasingOrder {

    // This method prints numbers from n up to 10
    static void printIncreasingOrder(int n) {
        // Base case: if n becomes greater than 10, stop the recursion
        if (n > 10) return;

        // Print the current number
        System.out.print(n + " ");

        // Move to the next number by calling the same function with n + 1
        printIncreasingOrder(n + 1);
    }

    public static void main(String[] args) {
        // We want to start printing from 1
        int n = 1;

        // Call the recursive function to start printing numbers
        printIncreasingOrder(n);
    }
}
