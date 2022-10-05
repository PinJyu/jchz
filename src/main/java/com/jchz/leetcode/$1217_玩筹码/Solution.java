package com.jchz.leetcode.$1217_玩筹码;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 22:59
 */
public class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd;
        for (int i : position) {
            if (i % 2 == 0) {
                even++;
            }
        }
        odd = position.length - even;
        return Math.min(even, odd);
    }
}
