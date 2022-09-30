package com.jchz.leetcode.$0868_二进制间距;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-30 13:08
 */
public class Solution {
    public int binaryGap(int n) {
        if ((n & (n - 1)) == 0) return 0;

        int lastIndex = -1, max = 0;
        for (int i = n, j = 0; i > 0; i >>>= 1, j++) {
            if ((i & 1) == 1) {
                if (lastIndex != -1) {
                    max = Math.max(max, j - lastIndex);
                }

                lastIndex = j;
            }
        }

        return max;
    }
}
