package com.jchz.leetcode.$1470_重新排列数组;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 20:04
 * @see
 * @since
 */
public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int half = nums.length / 2;

        int[] res = new int[nums.length];
        int index = 0;
        for (int i = 0; i < half; i++) {
            res[index++] = nums[i];
            res[index++] = nums[half + i];
        }

        return res;
    }

}
