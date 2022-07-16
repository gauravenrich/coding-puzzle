package com.puzzle.sortandsearch;

/**
 * Searching in an array where adjacent differ by at most k
 * Let this difference be ‘diff’. From the given property of the array, we always know that x must be at least
 * ‘diff/k’ away, so instead of searching one by one, we jump ‘diff/k’.
 * @author gsinha
 * 16th july 2022
 */
public class SearchAdjAtMostK {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 7, 7, 6 };
        int x = 6;
        int k = 2;
        int n = arr.length;

        System.out.println("Element " + x +
                " is present at index "
                + search(arr, n, x, k));
    }

    private static int search(int[] arr, int n, int x, int k) {
        int i=0;
        while (i<n){
            if(arr[i]==x){
                return i;
            }
            i=i+Integer.max(1,Math.abs(arr[i]-x)/k);
        }
        System.out.println("number is " +
                "not present!");
        return -1;
    }
}
