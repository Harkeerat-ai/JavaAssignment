/**
 * Performs binary search on a sorted integer array using a recursive approach.
 * Each call halves the search range until the target is found or the range is empty.
 * Returns the index of the target element if found, otherwise -1.
 */
public class BinarySearchRecursive {

    /**
     * Recursively searches for the target value within the given range.
     *
     * @param arr    the sorted array to search in
     * @param left   the left boundary index (inclusive)
     * @param right  the right boundary index (inclusive)
     * @param target the value to search for
     * @return the index of the target, or -1 if not found
     */
    public static int binarySearch(int[] arr, int left, int right, int target) {
        // Base case: the search space is exhausted (left has moved past right),
        // which means the target is not present anywhere in the array, so return -1.
        if (left > right)
            return -1;

        // Find the middle index of the current search range.
        // Written as "left + (right - left) / 2" instead of "(left + right) / 2"
        // to prevent integer overflow when left and right are both very large.
        int mid = left + (right - left) / 2;

        // If the middle element equals the target, we have found it: return its index.
        if (arr[mid] == target)
            return mid;

        // Recurse into the appropriate half of the array based on the comparison:
        // If the middle value is greater than the target, the target (if present)
        // must lie in the left half, so search only the indexes before the middle.
        if (arr[mid] > target)
            return binarySearch(arr, left, mid - 1, target);

        // Otherwise (middle value is smaller than the target) the target (if present)
        // must lie in the right half, so search only the indexes after the middle.
        return binarySearch(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {
        // Create the array to search in. It must be sorted because binary search
        // only works correctly when the elements are in ascending order.
        int[] arr = {5, 10, 15, 20, 25, 30, 35};
        // The value we are looking for inside the array.
        int target = 30;

        // Call the recursive binary search over the whole array, starting at index 0
        // and ending at the last index (arr.length - 1). Store the returned index.
        int result = binarySearch(arr, 0, arr.length - 1, target);

        // If the returned value is not -1, the target was found, so print its index.
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            // Otherwise (-1) the target was not found, so print a message saying so.
            System.out.println("Element not found");
    }
}
