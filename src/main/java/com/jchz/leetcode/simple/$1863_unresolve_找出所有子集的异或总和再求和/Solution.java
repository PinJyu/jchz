package com.jchz.leetcode.simple.$1863_unresolve_找出所有子集的异或总和再求和;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 11:45
 */
public class Solution {

    public int subsetXORSum(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum |= i;
        }

        return sum << (nums.length - 1);
    }
}
