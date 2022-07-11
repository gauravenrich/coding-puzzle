package com.puzzle.array;

/**
 *  Date 08/03/2021
 *  @author gauravenrich
 * Given an array A[] that contains both positive and negative integers, find the maximum product subarray.
 */
public class MaxProductSubArray {

    public static int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int curProd = 1;
        for(int i = 0; i<nums.length; i++){
            curProd *= nums[i];
            ans = Math.max(ans,curProd);
            if(curProd == 0){
                curProd = 1; //this means current value is 0 and we cant keep carrying this subarray so prod reinitialized and new subarray will be taken
            }
        }

        curProd = 1;
        for(int i = nums.length-1; i>=0; i--){
            curProd *= nums[i];
            ans = Math.max(ans,curProd);
            if(curProd == 0){
                curProd = 1;
            }
        }

        return ans;
    }
    // Function to find maximum product subarray
    static int maxProduct(int arr[], int n) {

        // Variables to store maximum and minimum
        // product till ith index.
        int minVal = arr[0];
        int maxVal = arr[0];

        int maxProduct = arr[0];

        for (int i = 1; i < n; i++) {
            // When multiplied by -ve number,
            // maxVal becomes minVal
            // and minVal becomes maxVal.
            if (arr[i] < 0) {
                int temp = maxVal;
                maxVal = minVal;
                minVal = temp;
            }
            // maxVal and minVal stores the
            // product of subarray ending at arr[i].
            maxVal = Math.max(arr[i], maxVal * arr[i]);
            minVal = Math.min(arr[i], minVal * arr[i]);

            // Max Product of array.
            maxProduct = Math.max(maxProduct, maxVal);
        }

        // Return maximum product found in array.
        return maxProduct;
    }

    // Driver Code
    public static void main(String[] args) {
        int arr[] = {-1, -3, -10, 0, 60};
        int n = arr.length;

        System.out.println("Maximum Subarray product is "
                + maxProduct(arr, n));
        System.out.println("Maximum Subarray product is "
                + maxProduct(arr));
    }
}