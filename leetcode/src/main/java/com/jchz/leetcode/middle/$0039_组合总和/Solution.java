package com.jchz.leetcode.middle.$0039_组合总和;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-27 20:24
 */
public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backTrace(candidates, 0, 0, new ArrayList<>(), ans, target);
        return ans;
    }

    void backTrace(int[] a, int sum, int start, List<Integer> l, List<List<Integer>> ans, int target) {
        if (sum > target)
            return;
        if (sum == target) {
            ans.add(new ArrayList<>(l));
            return;
        }

        for (int i = start; i < a.length; i++) {
            l.add(a[i]);
            backTrace(a, sum + a[i], i, l, ans, target);
            l.remove(l.size() - 1);
        }
    }
}
