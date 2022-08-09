package com.puzzle.dynamic;

/**
 * Minimum Number of Jumps
 * @author gsinha
 * 9th aug 2022
 */
public class MinimumJump {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr));
    }
    static int minJumps(int[] arr){
        // your code here
        int jumps = 0;
        int currSum = 0;
        int max = 0;
        for(int i = 0; i < arr.length-1; i++) {
            max = Math.max(arr[i]+i, max);
            if(i == currSum) {
                if(arr[i] == 0 && max <= arr[i]+i)
                    return -1;
                jumps++;
                currSum = max;
            }
        }
        return jumps;
    }
}
