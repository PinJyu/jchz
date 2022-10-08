package com.jchz.leetcode.simple.$1184_公交站间的距离;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 22:24
 */
public class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start == destination) return 0;
        int low, up;
        if (start < destination) {
            low = start;
            up = destination;
        }
        else {
            low = destination;
            up = start;
        }

        int lsum = 0, rsum = 0;
        for (int i = low; i < up; i++) {
           lsum += distance[i];
        }

        int j = up;
        while (j != low) {

            rsum += distance[j];
            j = (j + 1) % distance.length;
        }


        return Math.min(lsum, rsum);
    }
}
