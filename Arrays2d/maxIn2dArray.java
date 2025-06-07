package Arrays2d;

import java.util.Arrays;

public class maxIn2dArray {

    public static void main(String[] args) {
        // Initialize a 2D array with varying row lengths
        int[][] arr = {
                {23, 4, 1},
                {18, 2, 3, 9},
                {78, 99, 34, 56},
                {18, 12, 100}
        };

        // Find the maximum value in the 2D array
        int ans = max(arr);

        // Print the maximum value
        System.out.println("The maximum value in the 2D array is: " + ans);
    }

    // Method to find the maximum value in a 2D array
    static int max(int[][] arr) {
        // Initialize max with the smallest possible integer value
        int max = Integer.MIN_VALUE;

        // Loop through each row
        for (int row = 0; row < arr.length; row++) {
            // Loop through each column in the current row
            for (int col = 0; col < arr[row].length; col++) {
                // Update max if the current element is greater
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }

        // Return the largest value found
        return max;
    }
}
