package com.jchz.leetcode.simple.$1422_分割字符串的最大得分;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 18:48
 * @see
 * @since
 */
public class Solution {
    public int maxScore(String s) {
        int countOne = 0;
        char[] cs = s.toCharArray();
        for (char c : cs) {
            if (c == '1')
                countOne++;
        }

        int leftZero = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < cs.length - 1; i++) {
            if (cs[i] == '0')
                leftZero++;

            int score = countOne - (i + 1 - leftZero) + leftZero;
            max = Math.max(score, max);
        }

        return max;
    }
}
