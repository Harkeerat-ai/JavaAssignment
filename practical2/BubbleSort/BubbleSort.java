// Import Arrays: provides the toString() helper used to print the sorted array nicely.
import java.util.Arrays;

/**
 * Sorts an integer array using the Bubble Sort algorithm.
 * Includes an early-exit optimization: if no swaps occur during a pass,
 * the array is already sorted and the algorithm terminates early.
 */
public class BubbleSort {

    /**
     * Sorts the given array in-place using bubble sort.
     *
     * @param arr the array to sort
     */
    public static void bubbleSort(int[] arr) {
        // n holds the size of the array so we know how many elements to compare.
        int n = arr.length;

        // Outer loop: number of passes required
        // Each pass moves the largest remaining element to its correct end position.
        for (int i = 0; i < n - 1; i++) {
            // swapped tracks whether any swap happened during this pass, reset for each pass.
            boolean swapped = false;

            // Inner loop: compare adjacent elements
            // Each pass shrinks the unsorted part by one (the last i elements are already placed).
            for (int j = 0; j < n - i - 1; j++) {
                // If the left element is bigger than the right, they are out of order.
                if (arr[j] > arr[j + 1]) {
                    // Swap if elements are in wrong order
                    // Save the left value before overwriting it.
                    int temp = arr[j];
                    // Move the smaller right value into the left slot.
                    arr[j] = arr[j + 1];
                    // Move the larger value into the right slot.
                    arr[j + 1] = temp;
                    // Record that a swap happened, so the outer loop knows sorting is still needed.
                    swapped = true;
                }
            }

            // If no swaps occurred, the array is already sorted
            if (!swapped)
                // Exit the outer loop early since the array is now sorted.
                break;
        }
    }

    public static void main(String[] args) {
        // Create a sample unsorted array to demonstrate the sorting.
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        // Call the bubble sort method which sorts the array in-place.
        bubbleSort(arr);

        // Print a heading before the sorted values.
        System.out.println("Sorted Array:");
        // Print the whole sorted array on one line using the Arrays helper.
        System.out.println(Arrays.toString(arr));
    }
}