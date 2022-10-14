package com.jchz.leetcode.simple.$2347_最好的扑克手牌;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-14 23:19
 * @see
 * @since
 */
public class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        String res;

        do {
            boolean same = true;
            for (int i = 0; i + 1 < suits.length; i++) {
               if (suits[i] != suits[i + 1]) {
                   same = false;
                   break;
               }
            }
            if (same) {
                res = "Flush";
                break;
            }

            int[] map = new int[14];
            for (int i : ranks) {
                map[i]++;
            }
            int max = 0;
            for (int i : map) {
                max = Math.max(i, max);
            }

            if (max > 2)
                res = "Three of a Kind";
            else if (max > 1)
                res = "Pair";
            else
                res = "High Card";

        }
        while (false);

        return res;
    }

}
