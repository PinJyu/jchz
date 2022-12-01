package com.jchz.leetcode.simple.$剑指Offer0039_数组中出现次数超过一半的数字;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-18 11:31
 */
public class Solution {
    public int majorityElement_1(int[] nums) {
        int candicate = 0, count = 0;
        for (int i : nums) {
            if (candicate == 0)
                candicate = i;

            count += candicate == i ? 1 : 0;
        }

        return candicate;
    }
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ret = -1;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) > nums.length / 2 + 1) {
                ret = i;
                break;
            }
        }

        return ret;
    }

}
