package Recursion;

// This class finds the first occurrence of a given number (key) in an array using recursion
public class FirstOccurence {

    // Recursive method to find the first index where key appears
    static int firstOccurence(int arr[], int key, int idx) {
        // Base case: if we've reached the end of the array and didn't find the key
        if (idx == arr.length) {
            return -1; // key not found
        }

        // If current element matches the key, return the current index
        if (arr[idx] == key) {
            return idx;
        } else {
            // Otherwise, check the next element (recursive call)
            return firstOccurence(arr, key, idx + 1);
        }
    }

    public static void main(String[] args) {
        // Define the array
        int nums[] = {1, 2, 3, 5, 4, 6, 7, 5, 8, 9};

        // Key to search for
        int key = 5;

        // Start checking from index 0
        int result = firstOccurence(nums, key, 0);

        // Print result based on return value
        if (result != -1) {
            System.out.println(key + " is present at index: " + result);
        } else {
            System.out.println(key + " is not present in the array.");
        }
    }
}
