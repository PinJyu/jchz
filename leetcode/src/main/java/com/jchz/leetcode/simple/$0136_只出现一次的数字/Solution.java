package com.jchz.leetcode.simple.$0136_只出现一次的数字;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-13 13:18
 */
public class Solution {

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
