package sort;

import java.util.Arrays;
import java.util.Random;

public class SortChecker {

    static int[] getRamdomArray(){
        Random r = new Random();

        int [] arr = new int[10000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10000);
        }

        return arr;
    }


    static void check(){
        boolean same = true;

        for (int i = 0; i < 1000; i++) {
            int [] arr = getRamdomArray();
            int [] arr2 = new int[arr.length];

            System.arraycopy(arr,0, arr2, 0, arr.length);
            Arrays.sort(arr);

            QuickSort.quickSort(arr2, 0, arr.length -1);
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] != arr2[i]) same = false;
            }
        }
        System.out.println(same);
    }

    public static void main(String[] args) {
        check();
    }

}
