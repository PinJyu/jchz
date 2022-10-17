package com.jchz.leetcode.simple.$2037_使每位学生都有座位的最少移动次数;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-12 18:42
 */
public class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int count = 0;
        Arrays.sort(seats);

        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            count += Math.abs(seats[i] - students[i]);
        }

        return count;
    }
}
