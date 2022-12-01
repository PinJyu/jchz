package com.jchz.leetcode.simple.$1446_连续字符;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 19:10
 * @see
 * @since
 */
public class Solution {
    public int maxPower(String s) {
        char[] cs = s.toCharArray();
        int count = 1, max = 1;
        for (int i = 1; i < cs.length; i++) {
            if (cs[i] == cs[i - 1]) {
                count++;
                max = Math.max(max, count);
            }
            else {
                count = 1;
            }
        }

        return max;
    }
}
