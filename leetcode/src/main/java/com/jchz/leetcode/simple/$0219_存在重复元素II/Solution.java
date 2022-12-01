package com.jchz.leetcode.simple.$0219_存在重复元素II;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-14 16:00
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map= new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            Integer li = map.get(v);
            if (li != null && i - li <= k) {
                return true;
            }
            map.put(v, i);
        }

        return false;
    }


    // 滑动窗口, 类似于双重for
    public boolean containsNearbyDuplicate_1(int[] nums, int k) {
        Set<Integer> set = new HashSet<>(); // value set, max-size = k

        for (int i = 0; i < nums.length; i++) {
            if (i >= k) {
                set.remove(nums[i - k]);
            }
            if(!set.add(nums[i])) {
                return false;
            }
        }
        return true;
    }
}
