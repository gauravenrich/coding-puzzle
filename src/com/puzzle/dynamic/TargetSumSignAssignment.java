package com.puzzle.dynamic;

import java.util.Arrays;

/**
 * Date 12/31/2020
 *
 * @author gauravenrich
 * Target Sum Problem
 * Given a list of non-negative integers, a1, a2, ..., an, and a target, S. Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.
 * Find out how many ways to assign symbols to make sum of integers equal to target S.
 * Example 1:
 * Input: nums is [1, 1, 1, 1, 1], S is 3.
 * Output: 5
 * Explanation:
 * -1+1+1+1+1 = 3
 * +1-1+1+1+1 = 3
 * +1+1-1+1+1 = 3
 * +1+1+1-1+1 = 3
 * +1+1+1+1-1 = 3
 * There are 5 ways to assign symbols to make the sum of nums be target 3.
 */
public class TargetSumSignAssignment {
    public static void main(String[] args){
        int arr[] = {1, 1, 1, 1, 1};
        int sum = 3;
        System.out.println("There are "+findSetWithTargetSum(arr, sum)+" ways to assign symbols to make the sum of numbers as target " + sum);
    }

    private static int findSetWithTargetSum(int[] arr, int diff) {
        int sum= Arrays.stream(arr).sum();
        int res=(sum+diff)/2;
        int n=arr.length;
        int[][] t=new int[n+1][res+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<res+1;j++){
                if(i==0){
                    t[i][j]=0;
                }
            }
        }
        for(int i=0;i<n+1;i++){
            for(int j=0;j<res+1;j++){
                if(j==0){
                    t[i][j]=1;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<res+1;j++){
                if(j>=arr[i-1]){
                    t[i][j]=t[i-1][j-arr[j-1]]+t[i-1][j];
                }
                else
                    t[i][j]=t[i-1][j];
            }
        }
        return t[n][res];
    }
}
