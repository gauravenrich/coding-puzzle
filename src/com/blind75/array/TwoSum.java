package com.blind75.array;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 42, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] a = twoSum.twoSum(nums, target);
        System.out.println(a[0] + " " + a[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int index;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                index = map.get(nums[i]);
                a[0] = index;
                a[1] = i;
                break;
            } else {
                map.put(target - nums[i], i);
            }


        }
        return a;
    }
}
