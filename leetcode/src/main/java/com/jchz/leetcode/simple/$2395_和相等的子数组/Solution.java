package com.jchz.leetcode.simple.$2395_和相等的子数组;

import java.util.HashSet;
import java.util.Set;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-15 01:43
 * @see
 * @since
 */
public class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i + 1 < nums.length; i++) {
            if (!set.add(nums[i] + nums[i + 1]))
                return true;
        }

        return false;
    }

}
