package com.puzzle.strings;

/**
 *  Date 11/13/2020
 *  @author gauravenrich
 *
 */

public class FirstNonRepeatChar {
    public static void main(String args[]){
        String string = "ADBCGHIEFKJLADTVDERFSWVGHKQWCNOPENSMSJWIERTFB" ;
        System.out.println("Output: "  + getFirstNonRepeatingCharacterLinearOptimized(string));
    }

    private static char getFirstNonRepeatingCharacterLinearOptimized(String input) {

        int[] hash=new int[256];
        for(int i=0;i<256;i++){
            hash[i]=-1;
        }
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(hash[c]==-1){
                hash[c]=i;
            }
            else {
                hash[c]=-2;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<256;i++){

            if(hash[i]>0 && i<min) {
                min=hash[i];
            }
        }
        return input.charAt(min);
    }

}
