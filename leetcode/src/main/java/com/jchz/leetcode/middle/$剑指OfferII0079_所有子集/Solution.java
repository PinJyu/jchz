package com.jchz.leetcode.middle.$剑指OfferII0079_所有子集;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-27 19:12
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < (1 << nums.length); i++) {
            List<Integer> l = new ArrayList<>();
            ans.add(l);
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) > 0)
                    l.add(nums[j]);
            }
        }

        return ans;
    }

    public List<List<Integer>> subsets_1(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backTrace(nums, new HashSet<>(), 0, ans);

        return ans;
    }

    void backTrace(int[] nums, Set<Integer> set, int index, List<List<Integer>> ans) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(set));
            return;
        }

        backTrace(nums, set, index + 1, ans);
        set.add(nums[index]);
        backTrace(nums, set, index + 1, ans);
        set.remove(nums[index]);

    }
}
