package Arrays;

//Max Subarray Sum - III (kadann's algorithm)

public class MaxSubarraySum3KadansAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;  // Holds the max subarray sum found so far

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];                      // Add current element to running sum
            maxSum = Math.max(maxSum, currSum);     // Update max if current sum is higher

            if (currSum < 0) {
                currSum = 0;  // Reset currSum if it drops below 0
            }
        }

        System.out.println("Max Subarray Sum: " + maxSum);
    }
}

/*
      Max Subarray Sum - III (Kadane's Algorithm) 🔥
    -------------------------------------------------

      Idea:
        Traverse the array and keep adding elements to a running sum (currSum).
        If currSum becomes negative, reset it to 0.
        Track the maximum sum seen so far.

      Time Complexity: O(n)
      Space Complexity: O(1)

      Handles:
        - Negative and positive numbers
        - Mixed arrays (e.g., {-2, -3, 4, -1, -2, 1, 5, -3})

       Edge Case (All negative values):
        The basic version resets currSum to 0 if it's negative,
        so in all-negative cases, maxSum will be 0 (incorrect).
        We fix this below by initializing currSum to 0 but checking maxSum before resetting.
*/