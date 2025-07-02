package Recursion;

public class RemoveDuplicates {

    // Recursive method to remove duplicate characters from the string
    static void rmoveDuplicares(String str, int idx, StringBuilder sb, boolean[] map) {
        // Base case: if we've reached the end of the string, print the result
        if (idx == str.length()) {
            System.out.println(sb);
            return;
        }

        // Get the current character at index
        char currChar = str.charAt(idx);

        // If character is already seen (marked true), skip adding it
        if (map[currChar - 'a']) {
            rmoveDuplicares(str, idx + 1, sb, map);
        } else {
            // Mark character as seen
            map[currChar - 'a'] = true;
            // Add character to result
            sb.append(currChar);
            // Continue recursion
            rmoveDuplicares(str, idx + 1, sb, map);
        }
    }

    public static void main(String[] args) {
        String str = "malayalam";

        // Call recursive function starting at index 0,
        // with an empty StringBuilder and a map to track seen characters
        rmoveDuplicares(str, 0, new StringBuilder(" "), new boolean[26]);
    }
}
