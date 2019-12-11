//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package sort;

import java.util.Arrays;

public class BubbleSort {
    static Integer[] integers = new Integer[]{4, 23, 6, 78, 1, 54, 231, 9, 12};

    public BubbleSort() {
    }

    public static void main(String[] args) {
        assert false;

        System.out.println(Arrays.toString(integers));
    }

    private static void bubbleSort() {
        int last = integers.length;

        boolean swap;
        do {
            swap = false;

            for(int i = 0; i < last - 1; ++i) {
                if (integers[i] < integers[i + 1]) {
                    swap = true;
                    int temp = integers[i];
                    integers[i] = integers[i + 1];
                    integers[i + 1] = temp;
                }
            }

            --last;
            System.out.println(Arrays.toString(integers));
        } while(swap);

    }
}
