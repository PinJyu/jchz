package com.jchz.leetcode.simple.$1893_检查是否区域内所有整数都被覆盖;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 16:31
 */
public class Solution {
    public boolean isCovered__1(int[][] ranges, int left, int right) {
        int[] map = new int[52];
        for (int[] range : ranges) {
            map[range[0]]++;
            map[range[1] + 1]--;
        }

        int sum = 0;
        for (int i = 0; i < map.length; i++) {
            sum += map[i];
            if (sum <= 0 && i >= left && i <= right)
                return false;
        }

        return true;
    }

    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] map = new int[51];
        for (int[] range : ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                map[i]++;
            }
        }

        for (int i = left; i <= right; i++) {
            if (map[i] == 0)
                return false;
        }

        return true;
    }
}
