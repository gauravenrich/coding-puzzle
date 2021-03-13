package com.puzzle.array;

/**
 *  Date 03/13/2020
 *  @author gauravenrich
 *  Find duplicates in O(n) time and O(1) extra space
 */
public class DuplicateNumber {

    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 1, 3, 6, 6 };
        findDuplicate(num);
    }
    public static void findDuplicate(int[] num) {
        for(int i=0;i<num.length;i++){
            int cur=Math.abs(num[i]);
            if(num[cur]>=0){
                num[cur]=-num[cur];
            }else {
                System.out.print(cur + " ");
            }
        }
    }

}
