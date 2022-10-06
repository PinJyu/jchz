package com.jchz.leetcode.$1295_统计位数为偶数的数字;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 19:35
 */
public class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
           if ((num >= 10 && num <= 99) || (num >= 1000 && num <= 9999) || (num == 100000))
               count++;
        }

        return count;
    }
}
