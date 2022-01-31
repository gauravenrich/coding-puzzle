package com.puzzle.array;

public class FruitBasket {
    public static void main(String[] args) {
        int[] fruits={0,0,1,1};
        System.out.println(totalFruit(fruits));
    }
    public static int totalFruit(int[] fruits) {
        int first=-1;
        int second=-1;
        int max=0;
        int curMax=0;
        int secondCount=0;
        int i=0;
        for(int fruit:fruits){
            if(fruit==first || fruit==second){
                curMax+=1;
            }else{
                curMax=secondCount+1;
            }
            if(fruit==second){
                secondCount=secondCount+1;
            }else{
                secondCount=1;
            }
            if(fruit!=second){
                first=second;
                second=fruit;
            }
i++;
            max=Integer.max(max,curMax);
        }
        return max;
    }
}
