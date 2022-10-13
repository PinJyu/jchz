package com.jchz.leetcode.simple.$2154_将找到的值乘以2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-13 23:48
 * @see
 * @since
 */
public class Solution {
    public int findFinalValue_1(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        while (set.contains(original))
            original *= 2;

        return original;
    }
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for (int i : nums) {
            if (i == original)
                original *= 2;
        }

        return original / 2;
    }
}
