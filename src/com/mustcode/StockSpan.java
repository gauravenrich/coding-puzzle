package com.mustcode;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/online-stock-span/">...</a>
 *
 */
public class StockSpan {
    Stack<int[]> stack;
    public StockSpan(){
        stack=new Stack<>();
    }
    public int next(int price) {
        int count=0;
        count++;
        while (!stack.isEmpty() && stack.peek()[0]<price){
            count=count+stack.pop()[1];
        }
        stack.push(new int[]{price,count});
        return count;
    }
    public static void main(String[] args) {
        StockSpan stockSpan=new StockSpan();
        System.out.println(stockSpan.next(100));
        System.out.println(stockSpan.next(80));
        System.out.println(stockSpan.next(60));
        System.out.println(stockSpan.next(70));
    }
}
