package com.jchz.leetcode.middle.$0274_H指数;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-03 14:54
 */
public class Solution {

    public int hIndex_1(int[] citations) {
        int n = citations.length, sum = 0;
        int[] map = new int[n + 1];

        for (int i : citations) {
            if (i >= n) {
                map[n]++;
            }
            else {
                map[citations[i]]++;
            }
        }

        for (int i = n; i >= 0; i--) {
            sum += map[i];
            if (sum >= i) {
                return i;
            }
        }

        return 0;
    }

    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int n = citations.length, max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, Math.min(citations[i], n - i));
        }

        return max;
    }
}
