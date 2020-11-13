package com.puzzle.strings;

import java.util.Stack;

/**
 *  Date 11/13/2020
 *  @author gauravenrich
 *
 */
public class PostFixExp {

    public static void main(String args[]){
        String[] op = {"5" , "1" , "2" , "+" , "4" , "*" , "+" , "3" , "-" };
        System.out.println("Value of the expression is "  + evalPostfixExpression(op));
    }

    private static int evalPostfixExpression(String[] op) {

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<op.length;i++){
            String exp=null;
            String str=op[i];
            int num=0;
            if(op[i].charAt(0)>='0' && op[i].charAt(0)<='9'){
                num=Integer.parseInt(op[i]);
            }
            else {
                exp=op[i];
            }
            if(exp!=null){
                int result=0;
                int y=st.pop();
                int x=st.pop();

                if(exp.equals("+"))
                    result=x+y;
                else if(exp.equals("-"))
                    result=x-y;
                if(exp.equals("*"))
                    result=x*y;
                if(exp.equals("/"))
                    result=x/y;
                st.push(result);
            }
            else {
                st.push(num);
            }
        }
        return st.pop();
    }

}
