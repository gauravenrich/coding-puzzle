package com.puzzle.dynamic;

/**
 * LIS
 * @author gsinha
 * 30 june 2022
 */
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] a = {10, 9, 2, 5, 3, 7, 101, 18};
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        System.out.println(lis.lengthOfLIS(a));
    }

    public int lengthOfLIS(int[] nums) {
        int[] lis = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            lis[i] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && lis[j] + 1 > lis[i]) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
        int ans = -1;
        for (int nxt : lis) {
            ans = Math.max(ans, nxt);
        }
        return ans;
    }
}
