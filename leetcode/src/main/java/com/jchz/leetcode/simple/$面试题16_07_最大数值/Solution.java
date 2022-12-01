package com.jchz.leetcode.simple.$面试题16_07_最大数值;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-24 14:18
 */
public class Solution {

    public int maximum(int a, int b) {
        double x = (a + (double)b) / 2D;
        double y = Math.abs(a - ((a + (double)  b) / 2D));
        return (int) (x + y);
    }
}
