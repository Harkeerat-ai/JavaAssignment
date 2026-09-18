// Import Arrays: provides the Arrays.toString() utility used to print the array contents in a readable format.
import java.util.Arrays;

/**
 * Sorts an integer array using the Merge Sort algorithm (divide and conquer).
 * Recursively splits the array into halves, sorts each half, and merges them.
 */
public class MergeSort {

    /**
     * Merges two sorted subarrays (arr[left..mid] and arr[mid+1..right])
     * into a single sorted subarray.
     */
    public static void merge(int[] arr, int left, int mid, int right) {
        // Work out the size of the left subarray (indexes left..mid).
        int n1 = mid - left + 1;
        // Work out the size of the right subarray (indexes mid+1..right).
        int n2 = right - mid;

        // Create two temporary arrays: L will hold the left half and R will hold the right half.
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy the elements of the left half of arr into the temporary array L.
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        // Copy the elements of the right half of arr into the temporary array R.
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // i and j are the read positions for L and R; k is the write position back into arr.
        int i = 0, j = 0;
        int k = left;

        // Merge the two sorted halves back into arr by repeatedly picking the smaller front element.
        while (i < n1 && j < n2) {
            // If the front of L is smaller than or equal to the front of R, take it.
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;  // Move to the next element of L.
            } else {
                // Otherwise take the front of R instead.
                arr[k] = R[j];
                j++;  // Move to the next element of R.
            }
            // Move the write position forward in arr.
            k++;
        }

        // One of the halves may still have leftover elements; copy any remaining elements of L.
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy any remaining elements of R.
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * Recursively sorts the subarray from left to right using merge sort.
     */
    public static void mergeSort(int[] arr, int left, int right) {
        // Only continue if the current segment has more than one element (left is still before right).
        if (left < right) {
            // Find the middle index so the segment can be split into two halves.
            // This form of the expression avoids integer overflow.
            int mid = left + (right - left) / 2;

            // Recursively sort the left half (left..mid).
            mergeSort(arr, left, mid);
            // Recursively sort the right half (mid+1..right).
            mergeSort(arr, mid + 1, right);

            // Both halves are now sorted, so merge them back together in sorted order.
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        // Create an unsorted array that will be sorted using merge sort.
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        // Call merge sort on the whole array, from index 0 to the very last index.
        mergeSort(arr, 0, arr.length - 1);

        // Print a heading before showing the sorted array.
        System.out.println("Sorted Array:");
        // Arrays.toString() converts the array into a readable [a, b, c] format for printing.
        System.out.println(Arrays.toString(arr));
    }
}
