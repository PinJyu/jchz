package com.jchz.leetcode.simple.$LCP0055_采集果实;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-24 20:40
 */
public class Solution {
    public int getMinimumTime(int[] time, int[][] fruits, int limit) {
        int sum = 0;
        for (int[] fruit : fruits) {
            int i = fruit[1] / limit + ((fruit[1] % limit) > 0 ? 1 : 0);
            sum += i * time[fruit[0]];
        }

        return sum;
    }
}
