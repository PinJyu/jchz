package com.jchz.leetcode.$0961_在长度2N的数组中找出重复N次的元素;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-03 21:21
 */
public class Solution {
    public int repeatedNTimes(int[] nums) {
        int[] counts = new int[5001];

        for (int i : nums) {
            if (counts[i] == 0)
                counts[i]++;

            else
                return i;
        }
        return 0;
    }
}
