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
        int n = arr.length;

        // Outer loop: number of passes required
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            // Inner loop: compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap if elements are in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps occurred, the array is already sorted
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        bubbleSort(arr);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}
