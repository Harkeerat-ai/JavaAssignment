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
        int n = arr.length;

        // Move the boundary of the unsorted subarray one element at a time
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            // Swap the found minimum with the first element of the unsorted portion
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};

        selectionSort(arr);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}
