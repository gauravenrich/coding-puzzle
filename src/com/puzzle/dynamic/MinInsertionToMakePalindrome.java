package com.puzzle.dynamic;

/**
 * Date 01/02/2020
 * @author gauravenrich
 * Minimum number of insertions to make a string palindrome
 */
public class MinInsertionToMakePalindrome {
    public static void main(String[] args){
        String input = "pagbcba";
        System.out.println("Minimum Insertion To Make the string as Palindrome is " + minDelToMakePalindrome(input.toCharArray()));
    }

    private static int minDelToMakePalindrome(char[] x) {
        char[] y=new StringBuilder(new String(x)).reverse().toString().toCharArray();
        int m=x.length;
        int n=y.length;
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }else {
                    if(x[i-1]==y[j-1]){
                        dp[i][j]=1+dp[i-1][j-1];
                    }else {
                        dp[i][j]=Integer.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
        }
        return m-dp[m][n];
    }

}
