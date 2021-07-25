package com.puzzle.array;

public class KadaneAlgo {
    static int maxSum(int a[]) {
        int max_end_here = 0;
        int max_so_far = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            max_end_here = max_end_here + a[i];
            if (max_end_here > max_so_far) {
                max_so_far = max_end_here;
            }
            if (max_end_here < 0)
                max_end_here = 0;
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        //code
        int[] a={1,2,3,-2,5};
        System.out.println(maxSum(a));
    }
}

