package Arrays;

import java.util.Arrays;

// Trapping Rain Water Problem - Prefix Suffix Approach
// Time Complexity: O(n)
// Space Complexity: O(n)

public class TrappingRainWater {

    public static int trappedWater(int[] height) {
        int n = height.length;

        // Edge case: if there are no bars, no water can be trapped
        if (n == 0) return 0;

        // Step 1: Compute the leftMax array
        // leftMax[i] stores the maximum height to the left of or at index i
        int[] leftMax = new int[n];
        leftMax[0] = height[0]; // First element has no left, so it's itself
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Step 2: Compute the rightMax array
        // rightMax[i] stores the maximum height to the right of or at index i
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1]; // Last element has no right, so it's itself
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Step 3: Calculate the total trapped water
        int trappedWater = 0;

        // Loop through each bar and calculate trapped water at that index
        for (int i = 0; i < n; i++) {
            // Water level is determined by the minimum of left and right max heights
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // Water trapped = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }

        // Return the total trapped water
        return trappedWater;
    }

    public static void main(String[] args) {
        // Example input array representing the heights of bars
        int[] height = {4, 2, 0, 6, 3, 2, 5};

        // Expected output: 9 units of water trapped
        System.out.println("Total Trapped Water: " + trappedWater(height));
    }
}



/**
 * Formula:
 * For each bar, the water trapped = min(leftMax[i], rightMax[i]) - height[i]
 * We precompute:
 * - leftMax[i]: max height to the left of or at i
 * - rightMax[i]: max height to the right of or at i
 */