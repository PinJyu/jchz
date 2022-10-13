package com.jchz.leetcode.simple.$2148_元素计数;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-13 23:41
 * @see
 * @since
 */
public class Solution {
    public int countElements(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i : nums) {
            max = Math.max(i, max);
            min = Math.min(i, min);
        }

        int count = 0;
        for (int i : nums) {
            if (i != max && i != min)
                count++;
        }

        return count;
    }
}
