package Recursion;
import java.util.*;
/*
* You are given a number (eg - 2019), convert it into a String of english like
“two zero one nine”. Use a recursive function to solve this problem.
NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
can’t be 0.
*/
import java.util.ArrayList;
import java.util.List;

public class ConvertNumbersIntoSirings {

    // Array mapping digits (0-9) to their English word equivalents
    static String[] words = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
    };

    static List<String> getDigitWords(int n) {
        // Base case: if n becomes 0, return empty list
        if (n == 0) return new ArrayList<>();

        // Recursive call with the remaining digits
        List<String> result = getDigitWords(n / 10);

        // Add current digit's word to the result list
        result.add(words[n % 10]);
        return result;
    }

    static void printDigits(int n) {
        // Base case
        if (n == 0) return;

        // Process higher-order digits first (left to right)
        printDigits(n / 10);

        // Print the current digit's word
        System.out.print(words[n % 10] + " ");
    }

    public static void main(String[] args) {
        int num = 2019;

        // Option 1: Print digits directly
        System.out.print("Inline print: ");
        printDigits(num);  // Output: two zero one nine

        System.out.println();

        // Option 2: Get digit words as a list and print
        List<String> result = getDigitWords(num);
        System.out.println("List return: " + String.join(" ", result));
    }
}
