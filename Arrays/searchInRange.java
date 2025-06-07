package Arrays;

// Define a public class named LinearSearch
public class searchInRange {

    // Method to perform linear search
    public static int linearSearch(int arr[], int key,int start,int end){
        // Loop through each element of the array
        for (int i = start; i <= end; i++) {
            // Check if current element matches the key
            if(arr[i] == key){
                // Return the index where the key is found
                return i;
            }
        }
        // If the key is not found, return -1
        return -1;
    }

    // Main method to run the program
    public static void main(String[] args) {

        // Define and initialize an array of integers
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int start = 2;
        int end = 6;
        // Define the key to be searched
        int key = 14;

        // Call the linearSearch method and store the result (index or -1)
        int position = linearSearch(arr, key,start,end);

        // Check if key was found (position not -1)
        if(position != -1){
            System.out.println("Key is found at position " + position + "-th index");
        } else {
            // If key is not found, show this message
            System.out.println("Key is not Found.");
        }
    }
}

