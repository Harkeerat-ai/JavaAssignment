/**
 * Performs binary search on a sorted integer array using an iterative approach.
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
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents overflow

            if (arr[mid] == target)
                return mid;

            // Discard the half that cannot contain the target
            if (arr[mid] < target)
                left = mid + 1; // Search right half
            else
                right = mid - 1; // Search left half
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30, 35};
        int target = 25;

        int result = binarySearch(arr, target);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
