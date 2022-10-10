package com.jchz.leetcode.simple.$1732_找到最高海拔;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 16:01
 */
public class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0, n = 0;
        for (int i : gain) {
            n += i;
            max = Math.max(max, n);
        }

        return max;
    }
}
