package com.leetcode;

import java.util.Arrays;

/**
 * Leetcode 135. Candy
 * Input: ratings = [1,0,2]
 * Output: 5
 * Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
 */
public class CandyProblem {
    public static void main(String[] args) {
        int[] rating = {1, 0, 2};
        System.out.println(minCandy(rating));
    }
    private static int minCandy(int[] rating) {
        int total = 0;
        int[] leftArray = new int[rating.length];
        int[] rightArray = new int[rating.length];
        Arrays.fill(leftArray, 1);
        Arrays.fill(rightArray, 1);
        for (int i = 1; i < leftArray.length; i++) {
            if (rating[i - 1] < rating[i]) {
                leftArray[i] = leftArray[i-1] + 1;
            }
        }
        for (int i = rightArray.length - 2; i >= 0; i--) {
            if (rating[i] > rating[i+1]) {
                rightArray[i] = rightArray[i+1] + 1;
            }
        }
        for(int i=0;i<rating.length;i++){
            total+=Integer.max(leftArray[i],rightArray[i]);
        }
        return total;
    }
}
