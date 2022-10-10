package com.mustcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> result;

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        CombinationSum obj = new CombinationSum();
        List<List<Integer>> res = obj.combinationSum(candidates, target);
        System.out.println(res);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result=new ArrayList<>();
        if(candidates==null){
            return result;
        }
        combinationUtil(candidates,0,target,result,new ArrayList<>());
        return result;
    }

    private void combinationUtil(int[] candidates, int start,int target, List<List<Integer>> result, List<Integer> list) {
        if(target<0){
            return;
        }
        if(target==0){
            result.add(new ArrayList<>(list));
        }
        for (int i=start;i<candidates.length;i++){
            list.add(candidates[i]);
            combinationUtil(candidates,i,target-candidates[i],result,list);
            list.remove(list.size()-1); // once curSum> target remove last one and backtrack
        }
    }
}
