package com.puzzle.strings;

/**
 *  Date 11/13/2020
 *  @author gauravenrich
 *
 */

public class BalancedParentheses {

    public static void main(String args[]){
        String str = "((BCD)AE)" ;
        System.out.println("isValid: "  + isValid(str));
        str = ")(PH)N(X)" ;
        System.out.println("isValid: "  + isValid(str));
    }

    public static boolean isValid(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='('){
                count++;
            }
            else if (c==')'){
                if(count==0)
                    return false;
                count--;
            }
        }
        return  count==0;
    }
}
