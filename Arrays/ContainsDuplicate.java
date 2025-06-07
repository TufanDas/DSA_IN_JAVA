package Arrays;

import java.util.Arrays;

// Problem: Check if an integer array contains any duplicate values

public class ContainsDuplicate {

//Brute Force Approach
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static boolean containtDuplicate(int[] nums) {
        // Compare every pair in the array
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // If any two elements are equal, return true
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        // No duplicates found
        return false;
    }

// Optimized Approach using Sorting
    // Time Complexity: O(n log n) due to sorting
    // Space Complexity: O(1) if sorting is in-place
    public static boolean containsDuplicateSorting(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort the array

        // Step 2: Traverse and compare adjacent elements
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Duplicate found
            }
        }
        return false; // No duplicates
    }

    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 4, 2}; // Has duplicate (2)
        int nums2[] = {1, 2, 3, 4};    // No duplicate

        System.out.println("Using Brute Force: " + containtDuplicate(nums1)); // Output: true
        System.out.println("Using Sorting: " + containsDuplicateSorting(nums2)); // Output: false
    }
}
