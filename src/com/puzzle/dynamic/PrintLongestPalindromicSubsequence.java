package com.puzzle.dynamic;
/**
 * Date 02/01/2021
 * @author gauravenrich
 * Print Longest Palindromic Subsequence
 */
public class PrintLongestPalindromicSubsequence {
    public static void main(String[] args){
        String input = "pagbcbablplolpp";
        System.out.println("Longest palindromic subsequence is " + lpsPrint(input.toCharArray()));
    }

    private static String lpsPrint(char[] x) {
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
        int len=dp[m][n];
        char[] res=new char[len+1];
        res[len]='\u0000';
        int i=m;
        int j=n;
        len--;
        while(i>0 && j>0){
            if(x[i-1]==y[j-1]){
                res[len]=x[i-1];
                i--;
                j--;
                len--;
            }else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            }else {
                j--;
            }
        }
        return new String(res);
    }
}
