/**
 * Searches for a target value in an integer array using Linear Search.
 * Traverses the array sequentially and returns the index of the first
 * occurrence, or -1 if the target is not found.
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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 23, 89, 34};
        int target = 23;

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
