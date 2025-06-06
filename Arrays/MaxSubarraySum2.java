package Arrays;

//Max Subarray Sum - II (Prefix Sum)

public class MaxSubarraySum2 {
    public static void main(String[] args) {
        // Input array
        int arr[] = {2, 4, 6, 8, 10};

        // Step 1: Create prefix sum array
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0]; // First element is same

        // Fill prefix array
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Variables to track results
        int maxSum = Integer.MIN_VALUE;
        int totalSum = 0;
        int totalSubArray = 0;

        // Step 2: Generate all subarrays using prefix sums
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                // Compute subarray sum using prefix array
                int currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];

                // Track max sum
                maxSum = Math.max(maxSum, currSum);

                // Add to total of all subarrays
                totalSum += currSum;

                // Count subarrays
                totalSubArray++;
            }
        }

        // Output results
        System.out.println("Max Subarray Sum      : " + maxSum);
        System.out.println("Total Subarrays       : " + totalSubArray);
        System.out.println("Total of All Subarrays: " + totalSum);
    }
}


/*
 Max Subarray Sum using Prefix Sum
   ------------------------------------
 Formula for prefix sum:
     prefix[i] = prefix[i-1] + arr[i];

 Formula to calculate sum of subarray from i to j:
     subarraySum(i, j) = prefix[j] - prefix[i-1];
     (if i == 0, then subarraySum = prefix[j])

 Example:
     arr = [2, 4, 6, 8]
     prefix = [2, 6, 12, 20]
     subarray sum from index 1 to 3 = prefix[3] - prefix[0] = 20 - 2 = 18

 Time Complexity:
     - Building prefix array: O(n)
     - Nested loop to calculate all subarrays: O(n^2)
     => Overall: O(n^2)

 Space Complexity:
     - prefix array: O(n)

 Notes:
     - Useful when you need sum of multiple different subarrays fast.
     - Avoids repeated summing from scratch (brute force would be O(n^3)).

 Comparison with Kadane's Algorithm:
     - Kadane's (for max sum only):
         Time: O(n), Space: O(1)
     - Prefix Sum (for all subarrays):
         Time: O(n^2), Space: O(n)
*/
