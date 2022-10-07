package com.jchz.leetcode.$1437_是否所有1都至少相隔k个元素;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 19:07
 * @see
 * @since
 */
public class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int last1 = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (last1 != -1 && i - last1 < k + 1) {
                    return false;
                }
                last1 = i;
            }
        }

        return true;
    }
}
