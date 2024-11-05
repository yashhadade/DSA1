import java.util.Arrays;

public class MergeSort {
    public static void conquer(int[] arr, int si, int mid, int ei) {
        int[] merge = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merge[x++] = arr[idx1++];
            } else { 
                merge[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merge[x++] = arr[idx1++];
        }

        while (idx2 <= ei) { // Fixed condition
            merge[x++] = arr[idx2++]; // Fixed indexing
        }

        // Copy the merged elements back to the original array
        for (int i = 0; i < merge.length; i++) {
            arr[si + i] = merge[i]; // Fixed index assignment
        }
    }

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 2, 5, 4, 1, 7, 8};
        int n = arr.length;

        divide(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr)); // Improved output format
    }
}
