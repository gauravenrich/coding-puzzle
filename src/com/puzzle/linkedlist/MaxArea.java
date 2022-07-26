package com.puzzle.linkedlist;

public class MaxArea {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        MaxArea maxArea = new MaxArea();
        System.out.println(maxArea.maxArea(height));
    }

    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            if (height[left] > height[right]) {
                max = Integer.max(max, height[right] * (right - left));
                right--;
            } else {
                max = Integer.max(max, height[left] * (right - left));
                left++;
            }
        }
        return max;
    }
}
