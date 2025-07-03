package Recursion;
/*  print all binary string of size n without consecutive ones  */

public class BinaryStringsProblem {

    // Recursive method to print binary strings of length 'n'
    // such that no two 1s are adjacent.
    static void printBinaryString(int n, int lastPlace, String sb) {

        // Base case: if length becomes zero, we've built a valid string
        if (n == 0) {
            System.out.println(sb); // print the binary string
            return;
        }

        // Always allowed to add '0', doesn't affect adjacency rule
        printBinaryString(n - 1, 0, sb + "0");

        // Add '1' only if the last placed digit wasn't '1'
        // This avoids consecutive 1s
        if (lastPlace == 0) {
            printBinaryString(n - 1, 1, sb + "1");
        }
    }

    public static void main(String[] args) {
        // Starting with n = 3, last placed digit = 0, and empty string
        // This generates all binary strings of length 3 without consecutive 1s
        printBinaryString(3, 0, "");
    }
}

