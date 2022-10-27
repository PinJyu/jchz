package com.jchz.leetcode.middle.$1828_统计一个圆中点的数目;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-27 18:28
 */
public class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        int index = 0;
        for (int[] center : queries) {
            int sum = 0;
            int rr = center[2] * center[2];
            int x = center[0];
            int y = center[1];

            for (int[] p : points) {
                int x_ = p[0];
                int y_ = p[1];
                if ((x - x_) * (x - x_) + (y - y_) * (y - y_) <= rr)
                    sum++;
            }
            ans[index++] = sum;

        }

        return ans;
    }
}
