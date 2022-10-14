package com.jchz.leetcode.simple.$2315_统计星号;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-14 22:18
 * @see
 * @since
 */
public class Solution {
    public int countAsterisks(String s) {
        int stack = 0, count = 0;
        char[] cs = s.toCharArray();
        for (char c : cs) {
            if (stack == 0 && c == '*')
                count++;
            else if (c == '|')
                stack ^= 1;
        }

        return count;
    }

}
