package com.blind75.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Arrays.stream(nums).forEach(set::add);
        int result = 0;
        for (int num : nums) {
            if (!set.contains(num)) {
                continue;
            }
            int prev = num - 1;
            int next = num + 1;
            while (set.contains(prev)) {
                set.remove(prev);
                prev--;
            }
            while (set.contains(next)) {
                set.remove(next);
                next++;
            }
            result = Integer.max(result, next - prev - 1);
        }
        return result;

    }
}
