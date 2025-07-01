package Recursion;

// This class prints numbers from 1 to 10 using recursion (reverse logic)
public class PrintNumIncreasingOrder {

    // This method prints numbers from 1 up to n using post-order recursion
    static void printIncreasingOrder(int n) {
        // Base case: when n reaches 1, we stop going deeper
        if (n == 1) {
            System.out.print(n + " "); // Start printing from 1
            return; // Exit the recursion
        }

        // First, go deeper into the recursion by decreasing the number
        // This reaches down to 1 before printing anything
        printIncreasingOrder(n - 1);

        // Now that the deepest call is done, start printing on the way back
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        // We want to print from 1 to 10
        int n = 10;

        // Call the recursive function
        printIncreasingOrder(n);
    }
}
