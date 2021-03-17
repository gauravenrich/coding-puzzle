package com.puzzle.sortandsearch;

/**
 * Date 03/17/2021
 * @author gauravenrich
 * Square root of an integer
 */
public class FloorSquareRoot {
    public static void main(String[] args) {
        int x = 14;
        System.out.println(floorSqrt(x));
    }

    private static int floorSqrt(int x) {
        int ans=0;
        if(x==0 || x==1){
            return x;
        }
        int start=0;
        int end=x;
        while (start<=end){
            int mid=(start+end)/2;
            if(mid*mid==x){
                return mid;
            }else if(mid*mid>x){
                end=mid-1;
            }else {
                // Since we need floor, we update answer when mid*mid is
                // smaller than x, and move closer to sqrt(x)
                start = mid + 1;
                ans=mid;
            }
        }
        return ans;
    }
}
