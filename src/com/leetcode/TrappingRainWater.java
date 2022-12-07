package com.leetcode;

/**
 * 42. Trapping Rain Water
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 */
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(totalRainWater(height));
    }

    private static int totalRainWater(int[] height) {
        int total = 0;
        int n = height.length;
        int[] rightArray = new int[n];
        int maxRightSoFar = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (height[i] > maxRightSoFar) {
                maxRightSoFar = height[i];
            }
            rightArray[i] = maxRightSoFar;
        }
        int maxLeftSoFar = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (height[i] > maxLeftSoFar) {
                maxLeftSoFar = height[i];
            }
            total += Integer.min(maxLeftSoFar, rightArray[i]) - height[i];
        }

        return total;
    }
}
