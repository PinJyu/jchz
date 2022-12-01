package com.jchz.leetcode.simple.$1725_可以形成最大正方形的矩形数目;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 15:56
 */
public class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max = 0, count = 0;

        for (int[] rectangle : rectangles) {
            int min = Math.min(rectangle[0], rectangle[1]);
            if (min > max) {
                max = min;
                count = 1;
            }
            else if (min == max) {
                count++;
            }
        }

        return count;
    }
}
