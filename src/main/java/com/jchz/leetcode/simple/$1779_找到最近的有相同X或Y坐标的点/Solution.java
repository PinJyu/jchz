package com.jchz.leetcode.simple.$1779_找到最近的有相同X或Y坐标的点;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 18:00
 */
public class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE, minPos = 0;

        for (int i = 0; i < points.length; i++) {
            int distince = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
            if (distince < min && (x == points[i][0] || y == points[i][1])) {
                minPos = i;
                min = distince;
            }
        }

        return minPos;
    }
}
