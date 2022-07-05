package com.puzzle.dynamic;

/**
 * EditDistanceProblem
 * 5th july 2022
 */
public class EditDistanceProblem {
    public static void main(String[] args) {
        String s = "geek", t = "gessek";
        EditDistanceProblem distanceProblem=new EditDistanceProblem();
        System.out.println(distanceProblem.editDistance(s,t));
    }
    public int editDistance(String s, String t) {
        int m=s.length();
        int n=t.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<=n;i++){
            dp[0][i]=i;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else {
                    dp[i][j]=1+Integer.min(Integer.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
