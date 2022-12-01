package com.jchz.leetcode.simple.$LCP0017_速算机器人;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-16 13:37
 * @see
 * @since
 */
public class Solution {
    public int calculate(String s) {
        int x = 1, y = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                x = 2 * x + y;
            }
            else
                y = 2 * y + x;
        }

        return x + y;
    }

}
