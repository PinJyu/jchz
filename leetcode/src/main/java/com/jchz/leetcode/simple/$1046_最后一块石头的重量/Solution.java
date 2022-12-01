package com.jchz.leetcode.simple.$1046_最后一块石头的重量;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 15:11
 */
public class Solution {
    public int lastStoneWeight(int[] stones) {
        int[] map = new int[1001];

        for (int i : stones) {
            map[i]++;
        }


        int remain = 0;
        for (int i = map.length - 1; i >= 0; i--) {
            if (map[i] != 0) {
                if (remain > 0) {
                    map[remain - i]++;
                    map[i]--;
                    if (remain - i > i) {
                        remain = remain - i;
                        i--;
                        continue;
                    }
                    else
                        remain = 0;
                }
                if (map[i] % 2 == 0) {
                    map[i] = 0;
                }
                else {
                    remain = i;
                }
            }
        }

        return Math.max(remain, 0);
    }
}
