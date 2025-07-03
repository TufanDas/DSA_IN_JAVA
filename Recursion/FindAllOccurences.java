package Recursion;

import java.util.*;

/*
* Question 1 : For a given integer array of size N. You have to find all the occurrences
* (indices) of a given element (Key) and print them. Use a recursive function to solve this
* problem.
*/

public class FindAllOccurences {

    public static List<Integer> findOccuremces(int[] arr, int idx, int key, List<Integer> result) {
        // Base case: when we've checked the entire array
        if (idx == arr.length) {
            return result;
        }

        // If the current element matches the key, add its index to the result
        if (arr[idx] == key) {
            result.add(idx);
        }

        // Move to the next index
        return findOccuremces(arr, idx + 1, key, result);
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};

        // Call the recursive method starting from index 0,
        // looking for all occurrences of the number 2
        List<Integer> indices = findOccuremces(arr, 0, 2, new ArrayList<>());

        // Print the result
        System.out.println("Key found at indices: " + indices);
    }
}