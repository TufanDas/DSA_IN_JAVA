package Arrays2d;

import java.util.Arrays;

public class searchIn2dArray {

    public static void main(String[] args) {
        // Declare and initialize a 2D array with varying row lengths
        int[][] arr = {
                {23, 4, 1},
                {18, 2, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        // Target value to search for
        int target = 56;

        // Call the search method and store the result
        int ans[] = search(arr, target);

        // Print the result in [row, col] format
        System.out.println(Arrays.toString(ans));
    }

    // Method to search for a target value in a 2D array
    static int[] search(int[][] arr, int target) {
        // Loop through each row
        for (int row = 0; row < arr.length; row++) {
            // Loop through each column in the current row
            for (int col = 0; col < arr[row].length; col++) {
                // If the current element matches the target, return its position
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        // If target is not found, return [-1, -1]
        return new int[]{-1, -1};
    }
}


