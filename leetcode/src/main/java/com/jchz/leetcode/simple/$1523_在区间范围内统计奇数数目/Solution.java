package com.jchz.leetcode.simple.$1523_在区间范围内统计奇数数目;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-08 20:38
 * @see
 * @since
 */
public class Solution {
    public int countOdds(int low, int high) {
        if (low > high)
            return countOdds(high, low);

        return high - low == 1 ? 1 :
                high - low == 0 ? high % 2 == 0 ? 0 : 2 :
                        (high - low) % 2 == 0 ? low % 2 == 0 ? (high - low) / 2 : (high - low - 1) / 2 + 2 :
                                (high - low) / 2;
    }


// 前缀和
    public int countOdds_1(int low, int high) {
        return ((high  + 1) >> 1) - ((low - 1 + 1) >> 1);
    }
}

