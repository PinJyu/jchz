package com.jchz.leetcode.simple.$2006_差的绝对值为K的数对数目;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-12 16:17
 */
public class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int ans = 0;
        for (int i = nums.length - 1; i >= 1; i--) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            ans += map.getOrDefault(nums[i - 1] - k, 0);
            ans += map.getOrDefault(nums[i - 1] + k, 0);
        }

        return ans;
    }
}
