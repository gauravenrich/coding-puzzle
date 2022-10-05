package com.revision;

import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] towerHeight = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(getMaxRainwaterBetweenTowers(towerHeight));
    }

    private static int getMaxRainwaterBetweenTowers(int[] towerHeight) {
        int[] maxRightSoFar=new int[towerHeight.length];
        int maxRight=Integer.MIN_VALUE;
        int rainWater=0;
        int n=towerHeight.length;
        for(int i=n-1;i>=0;i--){
            if(towerHeight[i]>maxRight){
                maxRightSoFar[i]=towerHeight[i];
                maxRight=towerHeight[i];
            }else {
                maxRightSoFar[i]=maxRight;
            }
        }
        int maxLeft=0;
        System.out.println(Arrays.toString(maxRightSoFar));
        for(int i=0;i<n;i++){
            rainWater+=Integer.max(Integer.min(maxLeft,maxRightSoFar[i])-towerHeight[i],0);
            if(towerHeight[i]>maxLeft){
                maxLeft=towerHeight[i];
            }
        }
        return rainWater;
    }
}
