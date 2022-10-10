package com.jchz.leetcode.simple.$1854_人口最多的年份;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-10 22:35
 * @see
 * @since
 */
public class Solution {
    public int maximumPopulation_1(int[][] logs) {
        int[] map = new int[101];
        int max = 0, maxYear = 0;
        for (int[] log : logs) {
            map[log[0] - 1950]++;
            map[log[1] - 1950]--;
        }

        int sum = 0;
        for (int i = 0; i < map.length; i++) {
            sum += map[i];
            if (sum > max) {
                max = sum;
                maxYear = i;
            }
        }

        return maxYear + 1950;
    }

    public int maximumPopulation(int[][] logs) {
        int[] map = new int[101];
        int max = 0, maxYear = 0;
        for (int[] log : logs) {
            for (int i = log[0]; i < log[1]; i++) {
                map[i - 1950]++;
            }
        }
        for (int i = 0; i < map.length; i++) {
            if (map[i] > max) {
                max = map[i];
                maxYear = i + 1950;
            }
        }

        return maxYear;
    }
}
