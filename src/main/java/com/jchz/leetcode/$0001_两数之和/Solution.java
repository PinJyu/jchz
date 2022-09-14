package com.jchz.leetcode.$0001_两数之和;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-01 17:49
 */
class Solution {

    // 2n hash
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int find = target - nums[i];
            Integer findIndex;
            if ((findIndex = hashMap.get(find)) != null && i != findIndex) {
                return new int[] {i, findIndex};
            }
        }

        return null;
    }

    // 1n hash
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int find = target - nums[i];
            Integer findIndex;
            if ((findIndex = hashMap.get(find)) != null && i != findIndex) {
                return new int[] {i, findIndex};
            }
            hashMap.put(nums[i], i);
        }

        return null;
    }

}