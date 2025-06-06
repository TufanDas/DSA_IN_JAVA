package Arrays;

//MaxSubarraySum - I (Brute Force) {

public class MaxSubarraySum {

    public static void main(String[] args) {

        int eachSum = 0;                         // Stores individual subarray sum
        int totalSum = 0;                        // Sum of all subarrays
        int maxSum = Integer.MIN_VALUE;          // Max subarray sum found
        int minSum = Integer.MAX_VALUE;          // Min subarray sum found
        int arr[] = {2, 4, 6, 8, 10};            // Input array

        /*
         Formula:
            - Number of subarrays for array of length n = n*(n+1)/2
            - Subarray sum from index i to j (brute-force):
                  sum = arr[i] + arr[i+1] + ... + arr[j]
        */

        for (int i = 0; i < arr.length; i++) {
            int element = i;
            System.out.println("The subarray starts from: " + arr[element]);

            // j goes from i+1 to end of array to generate all subarrays
            for (int j = i + 1; j <= arr.length; j++) {
                eachSum = 0;

                // Print subarray from index i to j-1
                for (int k = i; k < j; k++) {
                    eachSum += arr[k];     // Add each element to the subarray sum
                    totalSum += arr[k];    // Add to overall total sum
                }

                // Print current subarray sum
                System.out.print(eachSum + " ");

                // Track maximum and minimum subarray sums
                maxSum = Math.max(eachSum, maxSum);
                minSum = Math.min(eachSum, minSum);
            }

            // Newline for next starting index
            System.out.println();
        }

        // Final Output
        System.out.println("Total sum of all subarrays : " + totalSum);
        System.out.println("Maximum subarray sum       : " + maxSum);
        System.out.println("Minimum subarray sum       : " + minSum);
    }
}

