package com.puzzle.dynamic;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String s = "babad";
        LongestPalindromeSubstring palindromeSubstring=new LongestPalindromeSubstring();
        System.out.println(palindromeSubstring.longestPalindrome(s));
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        boolean[][] dp=new boolean[n][n];
        int maxLength=1;
        int start=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                {
                    dp[i][j]=true;
                }
            }
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                start=i;
                maxLength=2;
            }
        }
        for(int k=3;k<=n;k++){
            for (int i = 0; i < n - k + 1; ++i) {
                int j = i + k - 1;
                if (dp[i + 1][j - 1]
                        && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;

                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        return  s.substring(
                start, start+maxLength );
    }
}
