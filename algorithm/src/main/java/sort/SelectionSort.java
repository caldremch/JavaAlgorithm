package sort;

import java.sql.Array;
import java.util.Arrays;

/**
 *
 * 参考网站:https://www.cnblogs.com/shen-hua/p/5424059.html
 *
 * 选择排序
 *
 * 选择排序的时间复杂度：简单选择排序的比较次数与序列的初始排序无关。
 * 假设待排序的序列有 N 个元素，则比较次数永远都是N (N - 1) / 2。
 * 而移动次数与序列的初始排序有关。当序列正序时，移动次数最少，为 0。
 * 当序列反序时，移动次数最多，为3N (N - 1) /  2。
 *
 *
 * 以下例子为简单选择排序
 *
 *
 * 基于此思想的算法主要有简单选择排序、树型选择排序和堆排序。（这里只介绍常用的简单选择排序）
 *
 * b) 简单选择排序的基本思想：给定数组：int[] arr={里面n个数据}；第1趟排序，
 * 在待排序数据arr[1]~arr[n]中选出最小的数据，将它与arrr[1]交换；第2趟，
 * 在待排序数据arr[2]~arr[n]中选出最小的数据，将它与r[2]交换；
 * 以此类推，第i趟在待排序数据arr[i]~arr[n]中选出最小的数据，将它与r[i]交换，直到全部排序完成。
 *
 */
public class SelectionSort {

    public static void start(int[] numbs){

        System.out.println(Arrays.toString(numbs));

        int length = numbs.length;

        for (int i = 0; i < length; i++) {

            int j = i;

            for (int k = j+1; k < length; k++) {
                if (numbs[j] > numbs[k]){
                    j = k;
                }
            }

            if (numbs[j]<numbs[i]){
                int temp  = numbs[i];
                numbs[i] = numbs[j];
                numbs[j] = temp;
            }
        }


        System.out.println(Arrays.toString(numbs));
    }


    public static void main(String[] args) {
        int[] arr={1,3,2,45,65,33,12};
        SelectionSort.start(arr);
    }
}
