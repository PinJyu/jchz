package com.jchz.leetcode.$0338_比特位计数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-16 15:11
 */
public class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        res[0] = 0;
        if (n == 0)
            return res;

        res[1] = 1;
        if (n == 1)
            return res;

        int next = 2;
        while (next < n + 1) {
            final int freezeSize = next;
            for (int i = 0; i < freezeSize && next < n + 1; i++, next++) {
                res[next] = res[i] + 1;
            }
        }

        return res;
    }
}
