package com.puzzle.dynamic;

import java.util.Arrays;
/**
 * Date 12/31/2020
 * @author gauravenrich
 * Subset count with given sum
 */
public class MinSubSetSumDifference {
    public static void main(String[] args) {
        int[] wt = new int[]{3, 1, 4, 2, 2, 1};
        System.out.println("Minimum subset sum difference is " +minSubSetSumDiff(wt));
    }

    private static int minSubSetSumDiff(int[] wt) {
        int n=wt.length;
        int sum = Arrays.stream(wt).sum();
        int diff=0;
        boolean[][] t=new boolean[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0)
                t[i][j]=false;
            }
        }
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(j==0)
                t[i][j]=true;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(j>=wt[i-1]){
                    t[i][j]=t[i-1][j-wt[i-1]]||t[i-1][j];
                }
                else
                    t[i][j]=t[i-1][j];
            }
        }
        for(int i=sum/2;i>=0;i--){
            if(t[n][i]){
                System.out.print(t[n][i]+" ");
                diff=sum-2*i;
                break;
            }
        }
        return diff;
    }
}
