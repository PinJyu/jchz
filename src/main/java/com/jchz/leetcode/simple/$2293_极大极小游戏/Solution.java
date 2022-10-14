package com.jchz.leetcode.simple.$2293_极大极小游戏;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-14 21:39
 * @see
 * @since
 */
public class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        while (n > 1) {
            n /= 2;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0)
                    nums[i] = Math.min(nums[i * 2], nums[i * 2 + 1]);
                else
                    nums[i] = Math.max(nums[i * 2], nums[i * 2 + 1]);
            }
        }

        return nums[0];
    }

}
