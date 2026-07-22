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
        // Sizes of the two subarrays to merge
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays for each half
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data into temporary arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        // Merge the two halves back into arr in sorted order
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy any remaining elements of R[]
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
        if (left < right) {
            int mid = left + (right - left) / 2; // Avoids overflow

            // Recursively sort both halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}
