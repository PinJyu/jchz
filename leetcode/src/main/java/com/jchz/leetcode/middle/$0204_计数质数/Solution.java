package com.jchz.leetcode.middle.$0204_计数质数;

import java.util.BitSet;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-01 20:25
 */
public class Solution {
    public int countPrimes(int n) {
        BitSet map = new BitSet(n);

        for (int i = 2; i < (n + 1) / 2; i++) {
            for (int j = 2; i < (n + 1) / 2; j++) {
                int p = i * j;
                if (p >= n)
                    break;
                else
                    map.set(p);
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!map.get(i))
                count++;
        }

        return count;
    }
}
