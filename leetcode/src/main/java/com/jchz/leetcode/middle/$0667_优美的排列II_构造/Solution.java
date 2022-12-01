package com.jchz.leetcode.middle.$0667_优美的排列II_构造;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-08 17:48
 */
public class Solution {
    // 构造题，脑筋急转弯，不会
    public int[] constructArray(int n, int k) {
        int[] answer = new int[n];
        int idx = 0;
        for (int i = 1; i < n - k; ++i) {
            answer[idx] = i;
            ++idx;
        }
        for (int i = n - k, j = n; i <= j; ++i, --j) {
            answer[idx] = i;
            ++idx;
            if (i != j) {
                answer[idx] = j;
                ++idx;
            }
        }
        return answer;
    }
}
