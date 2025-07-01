package Recursion;

// This class checks if an array is sorted in ascending order using recursion
public class CheckArraySortedOrNot {

    // This method checks whether the array is sorted starting from a given index
    static boolean isSorted(int[] arr, int idx) {
        // Base case: if we've reached the last element, the array is sorted
        if (idx == arr.length - 1) {
            return true;
        }

        // If the current element is greater than the next one, the array is not sorted
        if (arr[idx] > arr[idx + 1]) {
            return false;
        }

        // Otherwise, check the next pair (move one index ahead)
        return isSorted(arr, idx + 1);
    }

    public static void main(String[] args) {
        // Declare and initialize an array
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Start checking from index 0
        int idx = 0;

        // Call the method and print the result
        if (isSorted(arr, idx)) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}
