package Arrays;

public class FindLargestNumber {

    // Method to find the largest element in an integer array
    public static int findLargestElement(int[] arr){

        // Check if the array is empty
        if(arr.length == 0){
            // Return -1 to indicate that the array has no elements
            return -1;
        }

        // If the array has only one element, return that element
        if(arr.length == 1){
            return arr[0];
        }

        // Initialize a variable to store the largest number
        // Set it to the smallest possible integer value initially
        int largestNum = Integer.MIN_VALUE;

        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is greater than largestNum, update it
            if(arr[i] > largestNum){
                largestNum = arr[i];
            }
        }

        // Return the largest number found in the array
        return largestNum;
    }

    // Main method to execute the program
    public static void main(String[] args) {

        // Declare and initialize an integer array
        int arr[] = {1, 2, 6, 3, 55};

        // Call the method to find the largest number and store the result
        int largest = findLargestElement(arr);

        // Check if a valid largest number was found
        if(largest != -1){
            // Print the largest number
            System.out.println("The largest Number is " + largest);
        } else {
            // If the array was empty, print a message
            System.out.println("The array is Empty.");
        }
    }
}