package com.jchz.leetcode.middle.$0015_三数之和;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-27 20:54
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i + 2 < nums.length; i++) {
            if (i - 1 >= 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j + 1 < nums.length; j++) {
                if (j - 1 >= i + 1 && nums[j] == nums[j - 1])
                    continue;
                int n = -nums[i]-nums[j];
                Integer a = map.get(n);
                if (a != null && a > j)
                    ret.add(Arrays.asList(nums[i], nums[j], n));
            }
        }


        return ret;
    }
}
