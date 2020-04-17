package base;

import leetcode.TwoSum;

import java.lang.reflect.Array;

public class App {

    public static void main(String[] args) {

        int[] a = {1,
                3,
                11,
                2,
                9,
                1000,
                10003,
                100042,
                100052,
                10006,
                10007,
                10008,
        };
        BaseRunner runner = new TwoSum(a, 12);
        runner.run();

    }

}
