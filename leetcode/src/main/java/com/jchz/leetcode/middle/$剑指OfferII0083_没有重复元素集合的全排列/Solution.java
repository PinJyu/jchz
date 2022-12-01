package com.jchz.leetcode.middle.$剑指OfferII0083_没有重复元素集合的全排列;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-27 18:59
 */
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backTrace(nums, new HashSet<>(), new ArrayList<>(), ans);

        return ans;
    }

    void backTrace(int[] nums, Set<Integer> set, List<Integer> li, List<List<Integer>> ans) {
        if (set.size() == nums.length) {
            ans.add(new ArrayList<>(li));
            return;
        }

        for (int i : nums) {
            if (!set.add(i))
                continue;
            li.add(i);
            backTrace(nums, set, li, ans);
            li.remove(li.size() - 1);
            set.remove(i);
        }
    }
}
