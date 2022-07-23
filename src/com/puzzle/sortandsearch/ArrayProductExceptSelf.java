package com.puzzle.sortandsearch;

import java.util.Arrays;

/**
 * Leetcode 238. Product of Array Except Self
 * @author gsinha
 * 23 juky 2022
 */
public class ArrayProductExceptSelf {
    public static void main(String[] args) {
        ArrayProductExceptSelf pa = new ArrayProductExceptSelf();
        int arr[] = { 1,2,3,4};
        int n = arr.length;
        System.out.println("The product array is : ");
        int[] a=pa.productArray(arr, n);
        System.out.println(Arrays.toString(a));
    }

    private int[] productArray(int[] arr, int n) {
        int[] res=new int[n];
        res[0]=1;
        for (int i=1;i<n;i++){
            res[i]=res[i-1]*arr[i-1];
        }
        int right=1;
        for (int i=n-1;i>=0;i--){
            res[i]=res[i]*right;
            right=right*arr[i];
        }
        return res;
    }
}
