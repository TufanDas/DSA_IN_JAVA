package Arrays;

public class BinarySearch {

    // Method to perform binary search on a sorted array
    public static int binarySearch(int arr[], int key) {

        // Initialize starting and ending indices of the array
        int start = 0;
        int end = arr.length - 1;

        // Loop until the search space is exhausted
        while (start <= end) {

            // Calculate the middle index
            int mid = (start + end) / 2;

            // Check if the key is found at mid
            if (arr[mid] == key) {
                return mid;  // Return the index if key is found
            }
            // If key is greater, ignore the left half
            else if (arr[mid] < key) {
                start = mid + 1;
            }
            // If key is smaller, ignore the right half
            else {
                end = mid - 1;
            }
        }

        // If key is not found, return -1
        return -1;
    }

    // Main method to run the program
    public static void main(String[] args) {

        // Declare and initialize a sorted array
        int arr[] = {2, 4, 6, 8, 10, 12, 14};

        // Define the key to be searched
        int key = 12;

        // Call binarySearch method and store the result (index or -1)
        int position = binarySearch(arr, key);

        // Print result based on whether key was found or not
        if (position != -1) {
            System.out.println("The Key is found at position " + position+".");
        } else {
            System.out.println("The key is not present in the array.");
        }
    }
}