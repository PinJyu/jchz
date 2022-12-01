package com.jchz.leetcode.simple.$2176_统计数组中相等且可以被整除的数对;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 11:02
 */
public class Solution {
    public int countPairs(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i * j % k == 0 && nums[i] == nums[j])
                    count++;
            }
        }

        return count;
    }
}
