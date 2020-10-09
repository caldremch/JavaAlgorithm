package leetcode;

import base.BaseRunner;

public class ReverseInt extends BaseRunner {

    @Override
    protected void onRun() {
        System.out.println(exec(463847412));
    }

    /**
     * 2147483647
     * @param x
     * @return
     */
    private int exec(int x) {
        int res = 0;
        while (x != 0) {
            int temp = x % 10;
            x = x / 10;
            //Integer.MAX_VALUE / 10 = 7
            if (res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE / 10 && temp > 7) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10 || res == Integer.MIN_VALUE / 10 && temp < -8) {
                return 0;
            }
            res = res * 10 + temp;
        }
        return res;
    }
}
