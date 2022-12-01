package com.jchz.leetcode.simple.$1491_去掉最低工资和最高工资后的工资平均值;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 21:25
 * @see
 * @since
 */
public class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;

        for (int i : salary) {
            sum += i;
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        return (sum - min - max) / (salary.length - 2D);
    }
}
