package com.jchz.leetcode.simple.$1796_字符串中第二大的数字;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-10 21:20
 * @see
 * @since
 */
public class Solution {
    public int secondHighest(String s) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (c > max) {
                    int t = max;
                    max = c;
                    second = t;
                }
                else if (c != max && c > second) {
                    second = c;
                }
            }
        }

        return max == second ? -1 : second == Integer.MIN_VALUE ? -1 : second - '0';
    }
}
