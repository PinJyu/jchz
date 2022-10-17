package com.jchz.leetcode.simple.$LCP0040_心算挑战;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-16 16:28
 * @see
 * @since
 */
public class Solution {
    public int maxmiumScore(int[] cards, int cnt) {
        return trace(cards, 0, 0, cnt);
    }

    int trace(int[] cards, int sum, int start, int deep) {
        if (start > cards.length - deep || deep == 0)
            return sum;

        int max = 0;
        for (int i = start; i < cards.length; i++) {
            sum += cards[i];
            int v = trace(cards, sum, i + 1, deep - 1);
            if (v % 2 == 0)
                max = Math.max(max, v);
            sum -= cards[i];
        }

        return max;
    }

}
