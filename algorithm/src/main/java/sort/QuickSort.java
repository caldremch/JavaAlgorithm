package sort;

public class QuickSort extends BaseSort {


    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = partition(arr, left, right);
        quickSort(arr, left, mid - 1);
        quickSort(arr, mid + 1, right);
    }

    private static int partition(int[] arr, int a, int b) {
        int pivot = b;
        int left = a;
        int right = b - 1;

        while (left <= right) {
            while (left <= right && arr[left] <= arr[pivot]) left++;
            while (left <= right && arr[right] > arr[pivot]) right--;
            if (left < right) swap(arr, left, right);
        }

        swap(arr, left, pivot);
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {6, 23, 5, 2, 18, 9, 7};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, arr.length - 1);
        quickSort.show(arr);
    }

}
