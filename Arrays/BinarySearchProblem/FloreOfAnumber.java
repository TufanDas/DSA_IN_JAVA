package Arrays.BinarySearchProblem;

class FloorOfANumber {

    public static void main(String[] args) {
        // Test array must be sorted for binary search to work correctly
        int[] nums = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        // Call the floorOfANumber method and store the result
        int result = floorOfANumber(nums, target);

        // Print the result based on whether a floor was found
        if (result == -1) {
            System.out.println("No floor exists for target " + target);
        } else {
            System.out.println("Floor of " + target + " is at index " + result + ": " + nums[result]);
        }
    }

    // Function to find the floor of a given target in a sorted array
    static int floorOfANumber(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        // If target is smaller than the smallest number in the array,
        // there is no valid floor
        if (target < nums[0]) {
            return -1;
        }

        // Binary search loop
        while (start <= end) {
            // Calculate the middle index to avoid potential overflow
            int mid = start + (end - start) / 2;

            // If the target is exactly equal to the middle element, return its index
            if (nums[mid] == target) {
                return mid;
            }

            // If middle element is greater than target, discard right half
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                // If middle element is less than target, discard left half
                start = mid + 1;
            }
        }

        // At this point, end is the index of the largest number ≤ target (floor)
        return end;
    }
}
