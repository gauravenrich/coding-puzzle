package com.revision;

/**
 *  Date 11/24/2020
 *  @author gauravenrich
 *  Trapping Rainwater Problem
 */


import java.util.Arrays;

public class TrappingRainWater {
    
    public static void main(String[] args){
        int[] towerHeight = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(getMaxRainwaterBetweenTowers(towerHeight));

    }

    private static int getMaxRainwaterBetweenTowers(int[] towerHeight) {
        int[] maxSeenRight=new int[towerHeight.length];
        int maxSeenSoFar=0;

        for(int i=towerHeight.length-1;i>=0;i--){
            if(towerHeight[i]>maxSeenSoFar) {
                maxSeenRight[i] = towerHeight[i];
                maxSeenSoFar = towerHeight[i];
            }
            else {
                maxSeenRight[i]=maxSeenSoFar;
            }

        }
        System.out.println(Arrays.toString(maxSeenRight));
        int maxLeftSoFar=0;
        int rainWater=0;

        for(int i=0;i<towerHeight.length;i++){
            rainWater=rainWater+Integer.max(Integer.min(maxLeftSoFar,maxSeenRight[i])-towerHeight[i],0) ;
            if(towerHeight[i]>maxLeftSoFar)
                maxLeftSoFar=towerHeight[i];
        }

        return rainWater;
    }

}
