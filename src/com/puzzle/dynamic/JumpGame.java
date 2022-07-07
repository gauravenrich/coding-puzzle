package com.puzzle.dynamic;

/**
 * 55. Jump Game
 * 7th july 2022
 */
public class JumpGame {
    public static void main(String[] args) {
        int[] a = {2, 3, 1, 1, 4};
        JumpGame jumpGame = new JumpGame();
        System.out.println(jumpGame.canJump(a));
    }

    public boolean canJump(int[] nums) {
        int lastGoodIndex = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastGoodIndex) {
                lastGoodIndex = i;
            }
        }
        return lastGoodIndex == 0;
    }
}
