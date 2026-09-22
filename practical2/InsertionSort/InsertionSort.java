// Import Arrays: provides the toString() helper used to print the sorted array nicely.
import java.util.Arrays;

/**
 * Sorts an integer array using the Insertion Sort algorithm.
 * Builds the sorted array one element at a time by shifting elements
 * to insert each new element into its correct position.
 */
public class InsertionSort {

    /**
     * Sorts the given array in-place using insertion sort.
     *
     * @param arr the array to sort
     */
    public static void insertionSort(int[] arr) {
        // n holds the size of the array so we know how many elements to sort.
        int n = arr.length;

        // Start from the second element (first element is trivially sorted)
        // i tells us which element we are inserting into the already-sorted prefix.
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Element to be positioned
            // j starts at the element just before the key and moves leftwards.
            int j = i - 1;

            // Shift elements greater than key one position to the right
            // Keep shifting while j is still valid and the current element is bigger than the key.
            while (j >= 0 && arr[j] > key) {
                // Move the bigger element one slot to the right to make room.
                arr[j + 1] = arr[j];
                // Step backwards to check the next element on the left.
                j--;
            }

            // Place the key in its correct position
            // The loop stopped after the last bigger element, so put the key in the open slot.
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Create a sample unsorted array to demonstrate the sorting.
        int[] arr = {12, 11, 13, 5, 6};

        // Call the insertion sort method which sorts the array in-place.
        insertionSort(arr);

        // Print a heading before the sorted values.
        System.out.println("Sorted Array:");
        // Print the whole sorted array on one line using the Arrays helper.
        System.out.println(Arrays.toString(arr));
    }
}