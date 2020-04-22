package sort;

public class MergeSort extends BaseSort {


    public static int[] mergeSort(int[] arr, int arr2[]) {
        int[] temp = new int[arr.length + arr2.length];
        int a = 0, b = 0, c = 0;

        while (a < arr.length && b < arr2.length) {
            temp[c++] = arr[a] < arr2[b] ? arr[a++] : arr2[b++];
        }

        while (a < arr.length) {
            temp[c++] = arr[a++];
        }
        while (b < arr2.length) {
            temp[c++] = arr2[b++];
        }

        return temp;
    }


    public static void main(String[] args) {
        int[] arr = {1, 12, 23, 44};
        int[] arr2 = {2, 3, 555};
        show(mergeSort(arr, arr2));
    }

}
