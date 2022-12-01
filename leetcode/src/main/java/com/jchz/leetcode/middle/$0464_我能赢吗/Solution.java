package com.jchz.leetcode.middle.$0464_我能赢吗;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-24 18:47
 */
public class Solution {
    Map<Integer, Boolean> res = new HashMap<>();

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if ((1 + maxChoosableInteger) * maxChoosableInteger / 2 < desiredTotal)
            return false;

        return backtrack(0, maxChoosableInteger, 0, desiredTotal);
    }

    boolean backtrack(int sum, int max, int map, int desired) {
        if (!res.containsKey(map)) {
            boolean isWin = false;
            for (int i = 0; i < max; i++) {
                if (((map >> i) & 1) == 0) {
                    if (i + sum + 1>= desired) {
                        isWin = true;
                        break;
                    }
                    if (!backtrack(i + sum + 1, max, map | (1 << i), desired)) {
                        isWin = true;
                        break;
                    }
                }
            }

            res.put(map, isWin);
        }

        return res.get(map);
    }
}
