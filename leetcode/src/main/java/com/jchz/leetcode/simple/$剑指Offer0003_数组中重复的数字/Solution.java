package com.jchz.leetcode.simple.$剑指Offer0003_数组中重复的数字;

import java.util.HashSet;
import java.util.Set;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-16 16:48
 * @see
 * @since
 */
public class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num))
                return num;
        }

        return -1;
    }

}
