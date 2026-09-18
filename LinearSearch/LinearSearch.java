/**
 * Searches for a target value in an integer array using Linear Search.
 * Traverses the array sequentially, checking every element one by one in order,
 * and returns the index of the first occurrence, or -1 if the target is not found.
 */
public class LinearSearch {

    /**
     * Performs linear search on the given array.
     *
     * @param arr    the array to search in
     * @param target the value to search for
     * @return the index of the target, or -1 if not found
     */
    public static int linearSearch(int[] arr, int target) {
        // Loop through every index of the array, starting from the first element.
        for (int i = 0; i < arr.length; i++) {
            // Check whether the current element equals the value we are searching for.
            if (arr[i] == target) {
                // Match found: return the current index immediately.
                return i;
            }
        }
        // If the whole array was checked with no match, the target is not present, so return -1.
        return -1;
    }

    public static void main(String[] args) {
        // The unsorted array to be searched.
        int[] arr = {12, 45, 7, 23, 89, 34};
        // The value we want to find inside the array.
        int target = 23;

        // Perform the linear search and store the returned index (or -1 if not found).
        int result = linearSearch(arr, target);

        // If the result is not -1, the target was found at that index.
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            // Otherwise the target was not found anywhere in the array.
            System.out.println("Element not found");
        }
    }
}
