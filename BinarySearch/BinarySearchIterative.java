/**
 * Performs binary search on a sorted integer array using an iterative approach.
 * A loop repeatedly narrows the search range until the target is found or the range is empty.
 * Returns the index of the target element if found, otherwise -1.
 */
public class BinarySearchIterative {

    /**
     * Iteratively searches for the target value in the sorted array.
     *
     * @param arr    the sorted array to search in
     * @param target the value to search for
     * @return the index of the target, or -1 if not found
     */
    public static int binarySearch(int[] arr, int target) {
        // The left boundary of the current search range: start at the first index (0).
        int left = 0;
        // The right boundary of the current search range: start at the last index.
        int right = arr.length - 1;

        // Keep searching as long as the search range is still valid (left has not passed right).
        while (left <= right) {
            // Find the middle index of the current search range.
            // Using "left + (right - left) / 2" instead of "(left + right) / 2" avoids integer overflow.
            int mid = left + (right - left) / 2;

            // If the middle element equals the target, we have found it: return its index.
            if (arr[mid] == target)
                return mid;

            // Discard the half that cannot contain the target:
            // If the middle value is smaller than the target, the target must be in the right half,
            // so move the left boundary just past the middle element (search the right half).
            if (arr[mid] < target)
                left = mid + 1;
            else
                // Otherwise the target must be in the left half,
                // so move the right boundary just before the middle element (search the left half).
                right = mid - 1;
        }

        // If the loop ends, the search space is empty and the target was never found, so return -1.
        return -1;
    }

    public static void main(String[] args) {
        // Create the sorted array that will be searched.
        int[] arr = {5, 10, 15, 20, 25, 30, 35};
        // The value to search for inside the array.
        int target = 25;

        // Call the iterative binary search on the whole array and store the result.
        int result = binarySearch(arr, target);

        // If the returned value is not -1, the target was found, so print its index.
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            // Otherwise the target was not found, so print a message saying so.
            System.out.println("Element not found");
    }
}
