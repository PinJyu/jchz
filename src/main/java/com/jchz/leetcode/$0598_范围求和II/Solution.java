package com.jchz.leetcode.$0598_范围求和II;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-23 17:38
 */
public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) return m * n;

        int[] unionPoint = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        for (int i = 0; i < ops.length; i++) {
            unionPoint[0] = Math.min(unionPoint[0], ops[i][0]);
            unionPoint[1] = Math.min(unionPoint[1], ops[i][1]);
        }
        unionPoint[0] = Math.min(unionPoint[0], m);
        unionPoint[1] = Math.min(unionPoint[1], n);

        return unionPoint[0] * unionPoint[1];
    }
}
