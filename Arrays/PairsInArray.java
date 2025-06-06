package Arrays;

public class PairsInArray {

    // Method to print all unique pairs (i, j) where i < j and count them
    public static void pairsInAnArray(int arr[]) {
        int totalPairs = 0; // Variable to keep track of total number of pairs

        // Outer loop runs for each element
        for (int i = 0; i < arr.length; i++) {

            // Inner loop starts from i+1 to avoid duplicate and self-pairs
            for (int j = i + 1; j < arr.length; j++) {

                // Print the pair
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");

                // Increment the pair count
                totalPairs++;
            }
            System.out.println(); // Print new line after each row
        }

        // Print total number of pairs
        System.out.println("Total Pairs: " + totalPairs);
    }

    // Main method to execute the program
    public static void main(String[] args) {

        // Sample input array
        int arr[] = {2, 4, 6, 8, 10};

        // Print the array
        System.out.print("The Array is: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // Print all pairs and total count
        System.out.println("The Pairs of the array are:");
        pairsInAnArray(arr);
    }
}


/*
🔢 Formula:

for n umbers of element there are n-1 number of pairs

  For n elements, total pairs = nC2 = n(n-1)/2
  Example: n = 5 ⇒ 5*4/2 = 10 pairs

⏱ Time Complexity:
  Outer loop: O(n), Inner loop: O(n)
  Total: O(n²)

💾 Space Complexity:
  Only primitive variables used ⇒ O(1)
*/