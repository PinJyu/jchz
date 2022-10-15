package com.jchz.leetcode.simple.$2432_处理用时最长的那个任务的员工;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-16 01:30
 * @see
 * @since
 */
public class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int id = -1, max = -1, start = 0;
        for (int i = 0; i < logs.length; i++) {
            int[] task= logs[i];
            int duration = task[1] - start;
            start = task[1];

            if (duration > max) {
                max = duration;
                id = task[0];
            }
            else if (duration == max && task[0] < id) {
                id = task[0];
            }
        }


        return id;
    }

}
