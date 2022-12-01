package com.jchz.leetcode.middle.$0260_只出现一次的数字III;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-03 14:47
 */
public class Solution {
    public int[] singleNumber(int[] nums) {
        int cs = 0;
        for (int i : nums)
            cs ^= i;

        int lowbit = cs == Integer.MIN_VALUE ? Integer.MIN_VALUE : (cs & (-cs));

        int x = 0, y = 0;

        for (int i : nums) {
            if ((i & lowbit) != 0) x ^= i;
            else y ^= i;
        }

        return new int[]{x, y};
    }

}
