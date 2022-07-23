package com.puzzle.dynamic;

public class CombinationSumCount {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int target = 4;
        CombinationSumCount sumCount = new CombinationSumCount();
        System.out.println(sumCount.combinationSum4(nums, target));
    }

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 0;

        for (int i = 1; i <= target; i++) {
            int count = 0;
            for (int elem : nums) {
                if (elem > i) {
                    continue;
                } else if (elem == i) {
                    count++;
                } else {
                    count += dp[i - elem];
                }
            }
            dp[i] = count;
        }

        return dp[target];
    }
}
