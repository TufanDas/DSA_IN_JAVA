package Recursion;

// This class contains a method to print numbers in decreasing order using recursion
public class PrintNumDecreasingOrder {

    // This method prints numbers from n down to 1
    static void printDecresingOrder(int n) {
        // Base case: if n is 0, stop the recursion
        if (n == 0) return;

        // Print the current number
        System.out.print(n + " ");

        // Call the same function again with (n - 1)
        // This moves the number one step closer to 0
        printDecresingOrder(n - 1);
    }

    public static void main(String[] args) {
        // Start value for printing — change this to any number you like
        int n = 10;

        // Call the function to start printing from n to 1
        printDecresingOrder(n);
    }
}
