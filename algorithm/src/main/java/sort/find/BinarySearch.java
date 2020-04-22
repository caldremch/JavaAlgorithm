package sort.find;

import sort.QuickSort;

public class BinarySearch {

    public static int search(int arr[], int target, int left, int right) {

        if (target < arr[left] || target > arr[right] || left > right) return -1;

        int mid = (right + left) / 2;

        if (arr[mid] > target) {
            return search(arr, target, left, mid - 1);
        } else if (target > arr[mid]) {
            return search(arr, target, mid + 1, right);
        } else {
            return mid;
        }

    }

    public static int search2(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int middle = 0;


        if (target < arr[left] || target > arr[right] || left > right) return -1;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (arr[mid] > target) {
                right = mid - 1;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 1;
        int a = BinarySearch.search(arr, target, 0, arr.length - 1);
        int b = BinarySearch.search2(arr, target);
        System.out.println((a == b) + " " + a);
    }
}
