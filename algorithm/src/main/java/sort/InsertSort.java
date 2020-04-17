package sort;

import java.util.Arrays;

/**
 * @auther Caldremch
 * @email finishmo@qq.com
 * @date 2019-12-12 09:38
 * @description
 */
public class InsertSort {

    public static void start(int[] data){

        System.out.println(Arrays.toString(data));

        int length = data.length;
        //insertion feature is move. insert one, move several
        //first one is the basic insert data, so start with 1
        for (int i = 1; i < length; i++) {

            int temp = data[i];
            int j;
            for (j = i; j >0 && data[j-1]>temp ; j--) {
                data[j] = data[j-1];
            }
            System.out.println(j);
            data[j] = temp;
        }

        //数据[1, 3, 2, 45, 65, 33, 12] 演算过程
        /**
         * [1]表示为有序数组, 有序数组逐个和 第 i 个,称为 x(从 1 开始)比较, 如果x小于有序数组数组, 则需要后移, 腾出空间给 x
         *
         *
         *
         */


        /***********Understand the insertion, actually write bubble**********/
//        int length = data.length;
//
//        int temp;
//
//        for (int i = 0; i < length; i++) {
//
//            for (int j = 0; j < i+1; j++) {
//
//                if (data[i]<data[j]){
//                    temp = data[i];
//                    data[i] = data[j];
//                    data[j] = temp;
//                }
//            }
//        }
        /*********************/
        System.out.println(Arrays.toString(data));
    }

}
