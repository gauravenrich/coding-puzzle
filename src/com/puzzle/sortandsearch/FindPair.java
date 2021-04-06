package com.puzzle.sortandsearch;

import java.util.Arrays;


/**
 *  Date 07/04/2021
 *  @author gauravenrich
 *  Find a pair with the given difference
 */
public class FindPair {
    public static void main(String[] args) {
        int arr[] = {1, 8, 30, 40, 100};
        int n = 60;
        findPair(arr,n);
    }

    private static void findPair(int[] arr, int sum) {
        Arrays.sort(arr);
        int n=arr.length;
        int j=1;
        int i=0;

        while (j<n && i<n){
            if(i!=j && arr[j]-arr[i]==sum){
                System.out.println("Pair is "+arr[j]+" "+arr[i]);
                break;
            }else if(arr[j]-arr[i]<sum){
                j++;
            }else
                i++;
        }
    }
}
