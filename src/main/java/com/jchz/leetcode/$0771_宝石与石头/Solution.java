package com.jchz.leetcode.$0771_宝石与石头;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-28 18:18
 */
public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] map = new int[128];

        for (char c : jewels.toCharArray()) {
            map[c] = 1;
        }

        int res = 0;
        for (char c : stones.toCharArray()) {
            if (map[c] == 1)
                res++;
        }

        return res;
    }
}
