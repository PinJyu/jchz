package com.jchz.leetcode.simple.$1128_等价多米诺骨牌对的数量;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 20:18
 */
public class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] map = new int[100];

        int ret = 0;
        for (int[] dominoe : dominoes) {
            int val = dominoe[0] < dominoe[1] ? dominoe[0] * 10 + dominoe[1] : dominoe[1] * 10 + dominoe[0];
            ret += map[val];
            map[val]++;
        }

        return ret;
    }
}
