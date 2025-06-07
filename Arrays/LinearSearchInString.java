package Arrays;

import java.util.Arrays;

// Define a public class named LinearSearchInString
public class LinearSearchInString {

    // Main method to run the program
    public static void main(String[] args) {

        // Define and initialize a string
        String str = "tufan Das";

        // Define the target character to search for
        char target = 'D';

        // Call the second search method (search2) which prints if target is found
        search2(str, target);

        // Call the first search method (search) and check the return value
        if (search(str, target) != 0) {
            System.out.println("The Target is found in the position: " + search(str, target));
        } else {
            System.out.println("Target is not found.");
        }

         //debug prints to show character array (commented out)
        // System.out.println(str.toCharArray());
       // System.out.println(Arrays.toString(str.toCharArray()));
    }

    // A method that searches for a character in a string using enhanced for-loop
    static void search2(String str, char target) {
        // Check for empty string
        if (str.length() == 0) {
            System.out.println("The length of the string is 0.");
        }

        // Loop through each character in the string
        for (int ele : str.toCharArray()) {
            if (ele == target) {
                System.out.println("The target is found in search function 2.");
            }
        }
    }

    // A method that searches for a character in a string and returns its index
    static int search(String str, char target) {
        // Check for empty string
        if (str.length() == 0) {
            return 0;
        }

        // Loop through the string character by character
        for (int i = 0; i < str.length(); i++) {
            // If character matches the target, return its index
            if (str.charAt(i) == target) {
                return i;
            }
        }

        // Return 0 if target is not found (⚠️ Note: This can be confusing if target is at index 0)
        return 0;
    }
}
