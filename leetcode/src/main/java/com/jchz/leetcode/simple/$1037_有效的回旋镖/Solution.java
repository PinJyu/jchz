package com.jchz.leetcode.simple.$1037_有效的回旋镖;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-04 23:20
 */
public class Solution {
    public boolean isBoomerang(int[][] points) {
        int[] point1 = points[0], point2 = points[1], point3 = points[2];


        return (point1[0] - point2[0]) * (point2[1] - point3[1]) !=
                (point1[1] - point2[1]) * (point2[0] - point3[0]);

    }
}
