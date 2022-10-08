package com.jchz.leetcode.simple.$0217_存在重复元素;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-14 15:55
 */
public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }

        return false;
    }
}
