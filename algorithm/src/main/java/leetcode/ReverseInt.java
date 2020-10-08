package leetcode;

import base.BaseRunner;

public class ReverseInt extends BaseRunner {

    @Override
    protected void onRun() {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(exec(-214748));
    }

    private int exec(int x){
        long res = 0;
        while (x!=0){
            int temp = x%10;
            res = res*10+temp;
            if (res>Integer.MAX_VALUE || res<Integer.MIN_VALUE){
                return 0;
            }
            x  = x/10;
        }
        return (int)res;
    }
}
