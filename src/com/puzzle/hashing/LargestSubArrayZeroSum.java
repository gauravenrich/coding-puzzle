package com.puzzle.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Largest SubArray Zero Sum
 * @author gsinha
 * 19th july 2022
 */
public class LargestSubArrayZeroSum {
    public static void main(String[] args) {
        int[] arr
                = new int[]{15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(maxSubArrayLen(arr));
    }

    private static int maxSubArrayLen(int[] arr) {
        int max = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                max = i + 1;
            } else {
                if (map.containsKey(sum)) {
                    max = Integer.max(max, i - map.get(sum)); // max(0,2-0)
                } else {
                    map.put(sum, i);
                }
            }
        }
        return max;
    }
}
