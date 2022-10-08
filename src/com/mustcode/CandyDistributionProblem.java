package com.mustcode;

import java.util.Arrays;

public class CandyDistributionProblem {
    public static void main(String[] args) {
        int[] ratings = {1,7,6,3,3,8};
        System.out.println(candy(ratings));
    }

    public static int candy(int[] a) {
        int len = a.length;
        int[] leftArray = new int[len]; // to compare with left neighbour
        int[] rightArray = new int[len];  // to compare with right neighbor
        //each child will get at least one candy
        Arrays.fill(leftArray, 1);
        Arrays.fill(rightArray, 1);

        for (int i = 1; i < len; i++) {
            if (a[i] > a[i - 1])
                leftArray[i] = leftArray[i - 1] + 1;
            else
                leftArray[i] = 1;
        }
        for (int i = len - 2; i >= 0; i--) {
            if (a[i] > a[i + 1])
                rightArray[i] = rightArray[i + 1] + 1;
            else
                rightArray[i] = 1;
        }

        int sum = 0;
        for (int i = 0; i < len; i++) {
            // get maximum from the two sides of neighbors
            sum += Math.max(leftArray[i], rightArray[i]);
        }
        return sum;
    }

}
