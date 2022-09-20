package com.jchz.leetcode.$0495_提莫攻击;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-20 16:45
 */
public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res = 0;
        int end = -1;
        for (int timeSery : timeSeries) {
            int start = timeSery;
            int lastEnd = end;
            end = start + duration - 1;
            if (start <= lastEnd) {
                start = lastEnd + 1;
            }
            if (start <= end)
                res += end - start + 1;
        }

        return res;
    }
}
