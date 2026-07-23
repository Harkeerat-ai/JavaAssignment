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
        int n = arr.length;

        // Start from the second element (first element is trivially sorted)
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Element to be positioned
            int j = i - 1;

            // Shift elements greater than key one position to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the key in its correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        insertionSort(arr);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}
