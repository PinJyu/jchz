package com.jchz.leetcode.simple.$LCP0061_气温变化趋势;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-24 20:43
 */
public class Solution {

    public int temperatureTrend(int[] temperatureA, int[] temperatureB) {
        int count = 0, max = 0;
        for (int i = 1; i < temperatureA.length; i++) {
            int d1 = temperatureA[i] - temperatureA[i - 1];
            int d2 = temperatureB[i] - temperatureB[i - 1];

            if ((d1 == 0 && d2 == 0) || (d1 > 0 && d2 > 0) || (d1 < 0 && d2 < 0)) {
                count++;
                max = Math.max(count, max);
            }
            else
                count = 0;
        }

        return max;
    }
}
