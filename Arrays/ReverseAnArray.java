package Arrays;

public class ReverseAnArray {

    // Method to reverse the given array in-place
    public static void reverseArr(int arr[]) {
        // Initialize start and end pointers
        int start = 0;
        int end = arr.length - 1;

        // Swap elements from start to end until they meet in the middle
        while (start <= end) {
            // Store the current start element in a temporary variable
            int temp = arr[start];

            // Assign the end element to the start position
            arr[start] = arr[end];

            // Assign the temp (original start) to the end position
            arr[end] = temp;

            // Move the start pointer forward
            start++;

            // Move the end pointer backward
            end--;
        }
    }

    // Main method to run the program
    public static void main(String[] args) {

        // Declare and initialize the array
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        // Print the array before reversing
        System.out.print("The array before Reverse : ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // Call the method to reverse the array
        reverseArr(arr);

        // Print the array after reversing
        System.out.print("The array After  Reverse : ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}