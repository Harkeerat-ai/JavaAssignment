// Import Arrays: provides the Arrays.toString() utility used to print the array contents in a readable format.
import java.util.Arrays;

/**
 * Sorts an integer array using the Selection Sort algorithm.
 * Repeatedly finds the minimum element from the unsorted portion
 * and swaps it into the correct position.
 */
public class SelectionSort {

    /**
     * Sorts the given array in-place using selection sort.
     *
     * @param arr the array to sort
     */
    public static void selectionSort(int[] arr) {
        // Store the length of the array once so we do not recompute it inside the loops.
        int n = arr.length;

        // Move the boundary of the unsorted subarray one element at a time
        // Outer loop: everything before index i is already sorted; everything from i onwards is unsorted.
        for (int i = 0; i < n - 1; i++) {
            // Assume the first element of the unsorted portion is the smallest so far.
            int minIndex = i;

            // Find the minimum element in the unsorted portion
            // Inner loop: scan the rest of the unsorted portion looking for a smaller element.
            for (int j = i + 1; j < n; j++) {
                // If we find an element smaller than the current minimum, remember its index.
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            // Swap the found minimum with the first element of the unsorted portion,
            // which places it in its correct sorted position.
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Create an unsorted array that will be sorted using selection sort.
        int[] arr = {29, 10, 14, 37, 13};

        // Sort the array in-place (the original array itself gets rearranged).
        selectionSort(arr);

        // Print a heading before showing the sorted array.
        System.out.println("Sorted Array:");
        // Arrays.toString() converts the array into a readable [a, b, c] format for printing.
        System.out.println(Arrays.toString(arr));
    }
}
