package com.puzzle.dynamic;

/**
 * Leetcode 213. House Robber II
 * 5th july 2022
 */
public class HouseRobber2 {
    public static void main(String[] args) {
        int[] num = {2, 7, 9, 3, 1};
        HouseRobber2 houseRobber = new HouseRobber2();
        System.out.println(houseRobber.rob(num));
    }

    private int rob(int[] num) {
        if (num.length == 1) {
            return num[0];
        }
        return Integer.max(robUtil(num, 0, num.length - 1), robUtil(num, 1, num.length));
    }

    private int robUtil(int[] num, int start, int end) {
        int prevOne = 0;
        int prevTwo = 0;
        int max = 0;
        for (int i = start; i < end; i++) {
            max = Integer.max(prevOne, prevTwo + num[i]);
            prevTwo = prevOne;
            prevOne = max;
        }
        return max;
    }
}
