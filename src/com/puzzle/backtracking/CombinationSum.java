package com.puzzle.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode 39 CombinationSum
 *
 * @author gsinha
 * 9th july 2022
 */
public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        CombinationSum combinationSum = new CombinationSum();
        System.out.println(combinationSum.combinationSum(candidates, target));

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void backTrack(int[] candidates, int start, int target, List<Integer> list, List<List<Integer>> result) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(list));
        }
        for (int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);
            backTrack(candidates, i, target - candidates[i], list, result);
            list.remove(list.size() - 1);
        }
    }
}
