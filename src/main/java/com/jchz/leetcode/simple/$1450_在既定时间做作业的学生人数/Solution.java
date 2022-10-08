package com.jchz.leetcode.simple.$1450_在既定时间做作业的学生人数;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 19:15
 * @see
 * @since
 */
public class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i])
                count++;
        }

        return count;
    }
}
