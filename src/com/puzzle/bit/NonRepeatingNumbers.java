package com.puzzle.bit;

public class NonRepeatingNumbers {
    public static void main(String[] args) {

    }
    public int[] singleNumber(int[] nums) {
        int result = 0;
        int first = 0;
        int second = 0;
        int []res = new int[2];

        for(int e : nums)
        {
            result = result ^ e;
        }

        int rightBit = result&(-result);
        System.out.println(rightBit);
        for (int num : nums) {
            int cur = num & rightBit;
            if (cur == 1) {
                first = first ^ num;
            } else {
                second = second ^ num;
            }
        }

        res[0]=first;
        res[1]=second;
        return res;
    }
}
