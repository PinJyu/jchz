package com.jchz.leetcode.middle.$0275_H指数II;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-03 19:24
 */
public class Solution {
    public int hIndex(int[] citations) {
        int l = 0, r = citations.length - 1, n = citations.length;
        while (l < r) {
            int m = (l + r) / 2;
            int articles = n - m;
            if (citations[m] < articles)
                l = m + 1;
            else if (citations[m] > articles)
                r = m ;
            else
                return citations[m];
        }

        return Math.min(citations[l], n - l);
    }
}
