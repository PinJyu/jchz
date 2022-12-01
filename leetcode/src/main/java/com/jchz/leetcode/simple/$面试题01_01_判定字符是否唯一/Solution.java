package com.jchz.leetcode.simple.$面试题01_01_判定字符是否唯一;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 15:32
 * @see
 * @since
 */
public class Solution {
    public boolean isUnique(String astr) {
        int map = 0;
        for (char c : astr.toCharArray()) {
            int i = 1 << (c - 'a');
            if ((i & map) > 0)
                return false;

            map |= i;
        }

        return true;
    }

}
