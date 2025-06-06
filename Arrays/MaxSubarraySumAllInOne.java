package Arrays;

public class MaxSubarraySumAllInOne {

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 10};             // For Brute Force and Prefix Sum
        int[] arr2 = {-2, -3, 4, -1, -2, 1, 5, -3}; // For Kadane's Algorithm

        System.out.println("\n--- Max Subarray Sum I: Brute Force ---");
        bruteForce(arr1);

        System.out.println("\n--- Max Subarray Sum II: Prefix Sum ---");
        prefixSum(arr1);

        System.out.println("\n--- Max Subarray Sum III: Kadane's Algorithm ---");
        kadane(arr2);
    }

    // Method 1: Brute Force (O(n^3))
    public static void bruteForce(int[] arr) {
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Subarrays starting from: " + arr[i]);

            for (int j = i + 1; j <= arr.length; j++) {
                int eachSum = 0;
                for (int k = i; k < j; k++) {
                    eachSum += arr[k];     // Add each element to sum
                    totalSum += arr[k];    // Add to global total sum
                }
                System.out.print(eachSum + " ");
                maxSum = Math.max(maxSum, eachSum);
                minSum = Math.min(minSum, eachSum);
            }
            System.out.println();
        }

        System.out.println("Total sum of all subarrays: " + totalSum);
        System.out.println("Maximum subarray sum     : " + maxSum);
        System.out.println("Minimum subarray sum     : " + minSum);
    }

    /*
     Method 2: Prefix Sum Approach (O(n^2))
     ----------------------------------------
     Formula:
        prefix[i] = prefix[i-1] + arr[i]
     Subarray sum from i to j:
        sum = prefix[j] - prefix[i-1] if i > 0
        sum = prefix[j]              if i == 0
    */
    public static void prefixSum(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;
        int totalSum = 0;
        int totalSubArray = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, currSum);
                totalSum += currSum;
                totalSubArray++;
            }
        }

        System.out.println("Max Subarray Sum      : " + maxSum);
        System.out.println("Total Subarrays       : " + totalSubArray);
        System.out.println("Total of All Subarrays: " + totalSum);
    }

    /*
     Method 3: Kadane’s Algorithm (O(n))
     ----------------------------------------
     Idea:
        Traverse the array and keep adding to current sum (currSum).
        If currSum < 0, reset currSum to 0.
        Track the maximum sum (maxSum) at every step.

     Time Complexity: O(n)
     Space Complexity: O(1)

     Handles:
        - Positive and negative numbers
        - Mixed arrays
    */
    public static void kadane(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }

        System.out.println("Max Subarray Sum: " + maxSum);
    }
}

