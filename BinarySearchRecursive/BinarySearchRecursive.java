/**
 * Performs binary search on a sorted integer array using a recursive approach.
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
        // Base case: search space exhausted
        if (left > right)
            return -1;

        int mid = left + (right - left) / 2; // Prevents overflow

        if (arr[mid] == target)
            return mid;

        // Recurse into the appropriate half
        if (arr[mid] > target)
            return binarySearch(arr, left, mid - 1, target);

        return binarySearch(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30, 35};
        int target = 30;

        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
