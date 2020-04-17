package leetcode;

import base.BaseRunner;

import java.util.*;

public class TwoSum extends BaseRunner {


    private int []arr;
    private int sum;

    public TwoSum(int[] arr, int sum) {
        this.arr = arr;
        this.sum = sum;
    }


    @Override
    public void onRun() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (arr == null || arr.length < 2) return;
        //o(n2)
//        Set<Integer> set =new  HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            set.add(arr[i]);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            int ret = sum - arr[i];
//            set.remove(arr[i]);
//            if (set.contains(ret)){
//              Iterator<Integer> integerIterator = set.iterator();
//              int j = i+1;
//              while (integerIterator.hasNext()){
//                 int left =  integerIterator.next();
//                 if (left == ret){
//                     System.out.println("index[ "+i+","+j+"]");
//                     break;
//                 }
//              }
//            }
//        }

        Map<Integer, Integer> integerMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (integerMap.containsKey(sum-arr[i])){
                System.out.println("index[ "+i+","+integerMap.get(sum-arr[i])+"]");
                break;
            }
            integerMap.put(arr[i],i);
        }

    }


}
