package Arrays;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class countEvenDigits {
    public static void main(String[] args) {
        // Define an array of integers
        int arr[] = {12,345,2,6,7896,-2344};

        // Print the number of elements in the array that have an even number of digits
        System.out.println(countEvenDigits(arr));
    }

    // Method to check if a number has an even number of digits
    static boolean evenDigit(int digit) {
        if(digit < 0){
            digit *=  -1;
        }
        if(digit == 0){
            return false;
        }
        int count = 0;

        // Count the number of digits in the number
        while (digit > 0) {
            count++;
            digit = digit / 10;
        }

        // Return true if the digit count is even, false otherwise
        return count % 2 == 0;
    }



    // Method to count how many numbers in the array have an even number of digits
    static int countEvenDigits(int[] nums) {
        int evenCount = 0;

        // Iterate through each number in the array
        for (int digit = 0; digit < nums.length; digit++) {
            // If the number has an even number of digits, increment the counter
            if (evenDigit(nums[digit])) {
                evenCount++;
            }
        }

        // Return the total count of numbers with even digits
        return evenCount;
    }
}
