package com.jchz.leetcode.$1266_访问所有点的最小时间;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 15:58
 */
public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int ox = points[i][0];
            int oy = points[i][1];
            int dx = points[i + 1][0];
            int dy = points[i + 1][1];

            sum += Math.max(Math.abs(ox - dx), Math.abs(oy - dy));
        }

        return sum;
    }
}
