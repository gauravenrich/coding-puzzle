package com.puzzle.array;

import java.util.Arrays;

/**
 *  Date 07/17/2021
 *  @author gauravenrich
 *  Reverse Array
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] array= {21, 32, 43, 74, 75, 86, 97, 108, 149,1};
        reverseArrayMethod(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reverseArrayMethod(int[] a) {
        int end=a.length-1;
        int start=0;
        while(start<=end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}
