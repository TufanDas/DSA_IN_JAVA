package Recursion;

// This class finds the last occurrence of a given number (key) in an array using recursion
public class LastOccurence {

    // This method searches for the last occurrence of 'key' in the array
    static int lastOccurence(int arr[], int key, int idx) {
        // Base case: if we've gone past the last element, return -1 (key not found)
        if (idx == arr.length) {
            return -1;
        }

        // First, go all the way to the end of the array
        int isFound = lastOccurence(arr, key, idx + 1);

        // If the key was NOT found in the rest of the array,
        // but the current element matches the key, return the current index
        if (isFound == -1 && arr[idx] == key) {
            return idx;
        }

        // Otherwise, return the index from deeper recursive calls
        return isFound;
    }

    public static void main(String[] args) {
        // Example array
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 5, 9};

        // Key to search for
        int key = 5;

        // Start checking from index 0
        int result = lastOccurence(arr, key, 0);

        // Display the result
        if (result != -1) {
            System.out.println(key + " is present at index: " + result);
        } else {
            System.out.println(key + " is not present in the array.");
        }
    }
}

