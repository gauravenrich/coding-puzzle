package com.revision;

public class EditDistance {
    public static void main(String[] args) {
        String one="horse";
        String two="ros";
        System.out.println(minDistance(one,two));
    }

    private static int minDistance(String one, String two) {
        int m=one.length();
        int n=two.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0){
                    dp[i][j]=j;
                } else if (j==0) {
                    dp[i][j]=i;
                }else {
                    if(one.charAt(i-1)==two.charAt(j-1)){
                        dp[i][j]=dp[i-1][j-1];
                    }else {
                        dp[i][j]=1+Integer.min(dp[i-1][j],Integer.min(dp[i-1][j-1],dp[i][j-1]));
                    }
                }
            }
        }
        return dp[m][n];
    }
}
