package sorting;

import java.util.Arrays;

public class MergeSort {

    // Utility method to print array elements
    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return;
    }

    /**
     * Merges two sorted halves of the array into a temporary array,
     * and then copies the result back into the original array.
     */
    static void merge(int[] arr, int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];  // Temp array to store merged result

        int i = si;        // Pointer for left half
        int j = mid + 1;   // Pointer for right half
        int k = 0;         // Pointer for temp array

        // Merge the two halves while comparing elements
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // If any elements are left in the left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // If any elements are left in the right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the merged temp array back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }


    static void sort(int[] arr, int si, int ei) {

        // Base case: if array has 1 or no elements, it's already sorted
        if (si >= ei) {
            return;
        }

        // Find the mid-point to divide the array
        int mid = si + (ei - si) / 2;

        // Recursively sort the left and right halves
        sort(arr, si, mid);       // Sort left half
        sort(arr, mid + 1, ei);   // Sort right half

        // Merge the sorted halves
        merge(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        System.out.println("Array before sorting : " + Arrays.toString(arr));

        // Initial call to sort the entire array
        sort(arr, 0, arr.length - 1);

        System.out.println("Array after sorting : " + Arrays.toString(arr));

        // Print the sorted array
        printArr(arr);

    }
}
