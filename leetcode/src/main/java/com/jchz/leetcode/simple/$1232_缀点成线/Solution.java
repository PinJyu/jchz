package com.jchz.leetcode.simple.$1232_缀点成线;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 14:54
 */
public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int ox = coordinates[0][0];
        int oy = coordinates[0][1];
        int px = coordinates[1][0];
        int py = coordinates[1][1];
        int a = px - ox, b = py - oy;
        for (int i = 2; i < coordinates.length; i++) {
            int ox_ = coordinates[0][0];
            int oy_ = coordinates[0][1];
            int px_ = coordinates[i][0];
            int py_ = coordinates[i][1];
            int c = px_ - ox_, d = py_ - oy_;

            if (a * d != c * b)
                return false;
        }

        return true;
    }
}
