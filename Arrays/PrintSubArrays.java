package Arrays;

public class PrintSubArrays {

    public static void main(String[] args) {

        int ts = 0; // Counter for total subarrays
        int arr[] = {2, 4, 6, 8, 10}; // Input array

        // Outer loop to set the start index of subarray
        for (int i = 0; i < arr.length; i++) {

            // Middle loop to set the end (exclusive) index of subarray
            for (int j = i + 1; j <= arr.length; j++) {

                // Inner loop to print elements from i to j-1 (subarray)
                for (int k = i; k < j; k++) {

                    System.out.print(arr[k] + " ");
                }
                ts++; // Increment total subarray count
                System.out.println(); // Print new line after each subarray
            }
            System.out.println(); // Extra space after each i-th round
        }
        System.out.println("Total Subarray is: " + ts);
    }
}

/*
🔢 Formula:
  For an array of size n, number of subarrays = n(n + 1)/2
  Example: n = 5 ⇒ 5*6/2 = 15 subarrays

⏱ Time Complexity:
  O(n³) – 3 nested loops (start, end, print)

💾 Space Complexity:
  O(1) – no extra space used (excluding output)
*/