package com.puzzle.strings;

/**
 *  Date 11/29/2020
 *  @author gauravenrich
 *  Non RepeatingLongest SubString
 */


public class LongestSubStringNonRepeating {

    public static void main(String[] args) {
        String str = "ABCDABDEFGCABD";
        String longestSubstring = getLongestSubstringNonRepeatingChars(str);
        System.out.println("Longest substring non repeating chars by linear time method:\t" + longestSubstring);

    }

    private static String getLongestSubstringNonRepeatingChars(String str) {
        if(str==null){
            return null;
        }
        int[] charIndex=new int[256];
        for(int i=0;i<256;i++){
            charIndex[i]=-1;
        }
        int maxLength=1;
        int curLength=1;
        int prevIndex;
        int startIndex=0;

        charIndex[str.charAt(0)]=0;

        for(int i=1;i<str.length();i++){
            prevIndex=charIndex[str.charAt(i)];
            if(prevIndex==-1 || i-curLength>prevIndex){
                curLength++;
            }
            else {
                if(curLength>maxLength){
                    maxLength=curLength;
                    startIndex=i-maxLength;
                }
                curLength=i-prevIndex;

            }
            charIndex[str.charAt(i)] = i;
        }
        // Check if longest substring with non repeating characters ends at end of the string
        if(curLength > maxLength) {
            maxLength = curLength;
            startIndex = str.length() - maxLength;
        }

        return str.substring(startIndex,startIndex+maxLength);
    }
}
