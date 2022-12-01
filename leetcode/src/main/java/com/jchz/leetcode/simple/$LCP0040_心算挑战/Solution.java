package com.jchz.leetcode.simple.$LCP0040_心算挑战;

import java.util.Arrays;

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
        Arrays.sort(cards);

        int sum = 0, minOdd = -1, minEven = -1;

        for (int i = cards.length - 1; i >= cards.length - cnt; i--) {
            sum += cards[i];

            if (cards[i] % 2 == 0)
                minEven = cards[i];
            else
                minOdd =  cards[i];

        }

        if (sum % 2 == 0)
            return sum;


        int odd = -1, even = -1;
        for (int i = cards.length - cnt - 1; i >= 0; i--) {
            if (cards[i] % 2 == 0 && even == -1)
                even = cards[i];

            if (cards[i] % 2 == 1 && odd == -1)
                odd = cards[i];

            if (even != -1 && odd != -1)
                break;
        }

        int o2e = 0, e2o = 0;
        if (minOdd > 0 && even > 0)
            o2e = sum - minOdd + even;
        if (minEven > 0 && odd > 0)
            e2o = sum - minEven + odd;

        return Math.max(o2e, e2o);
    }

//    void trace(int[] cards, int sum, int start, int deep) {
//        if (deep == 0)  {
//            max = Math.max(sum % 2 == 0 ? sum : 0, max);
//            return;
//        }
//
//        if (start >= cards.length) {
//            return;
//        }
//
//        int max = 0;
//        for (int i = start; i < cards.length; i++) {
//            sum += cards[i];
//            trace(cards, sum, i + 1, deep - 1);
//            sum -= cards[i];
//        }
//    }
//
}
