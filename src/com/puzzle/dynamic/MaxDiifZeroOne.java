package com.puzzle.dynamic;

/**
 * Maximum difference of zeros and ones in binary string
 * @author gsinha
 * 17 july 2022
 */
public class MaxDiifZeroOne {
    public static void main(String[] args) {
       String s = "11000010001";
       MaxDiifZeroOne maxDiifZeroOne=new MaxDiifZeroOne();
       System.out.println(maxDiifZeroOne.maxSubstring(s));
    }

    int maxSubstring(String s) {
        int maxSoFar=-1;
        int maxEndingHere=0;
        for(int i=0;i<s.length();i++){
            int x=(s.charAt(i)=='0')?1:-1;
            maxEndingHere+=x;
            if(maxEndingHere>maxSoFar){
                maxSoFar=maxEndingHere;
            }
            if(maxEndingHere<0){
                maxEndingHere=0;
            }
        }
        return maxSoFar;
    }
}
