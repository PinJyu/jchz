package com.jchz.leetcode.simple.$1742_盒子中小球的最大数量;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 16:31
 */
public class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] map = new int[highLimit + 1];

        int max = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int box = getRadixSum(i);
            map[box]++;
            max = Math.max(max, map[box]);
        }

        return max;
    }

    int getRadixSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
