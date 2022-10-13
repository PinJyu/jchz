package com.jchz.leetcode.simple.$2124_检查是否所有A都在B之前;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-13 22:39
 * @see
 * @since
 */
public class Solution {
    public boolean checkString(String s) {
        boolean hasB = false;
        char[] cs = s.toCharArray();
        for (char c : cs) {
            if (c == 'b') {
                hasB = true;
            }
            if (c == 'a' && hasB) {
                return false;
            }
        }

        return true;
    }
}
