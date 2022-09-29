package com.jchz.leetcode.$0747_至少是其他数字两倍的最大数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-28 16:18
 */
public class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE, im = -1;
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            if (v > max) {
                int t = max;
                max = v;
                second = t;
                im = i;
            }
            else if (v > second) {
                second = v;
            }
        }

        return second != 0 && max / second >= 2 ? im : -1;
    }
}
