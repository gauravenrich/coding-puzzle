package com.puzzle.strings;

public class LongestPrefixSuffix {
    public static void main(String[] args) {
        LongestPrefixSuffix longestPrefixSuffix=new LongestPrefixSuffix();
        System.out.println(longestPrefixSuffix.lps("abab"));
    }

    int lps(String s) {
        // code here
        int n=s.length();
        int[] lps=new int[n];
        for(int i=1;i<n;i++){
            int j=lps[i-1];
            while(j>0 && s.charAt(i)!=s.charAt(j))
                j=lps[j-1];
            if(s.charAt(i)==s.charAt(j)){
                j++;
                lps[i]=j;
            }
        }
        return lps[n-1];
    }
}
