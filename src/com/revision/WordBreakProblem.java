package com.revision;

import java.util.Arrays;
import java.util.List;

public class WordBreakProblem {
    public static void main(String[] args) {
        String s = "catsandog";
        String[] wordDict = {"cats", "dog", "sand", "and", "cat"};
        WordBreakProblem obj=new WordBreakProblem();
    //    System.out.println(obj.wordBreak(s, Arrays.asList(wordDict)));

        s = "leetcode";
        String[] wordDict2 = {"leet","code"};
        System.out.println(obj.wordBreak(s, Arrays.asList(wordDict2)));
    }

    public boolean wordBreak(String s, List<String> wordList) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[s.length()] = true;
        for (int i = s.length() - 1; i >= 0; i--) {
            for (String w : wordList) {
                if (i + w.length() <= s.length() && s.startsWith(w, i)) {
                    dp[i] = dp[i + w.length()];
                }
                if (dp[i]) {
                    break;
                }
            }
        }
        return dp[0];
    }
}
