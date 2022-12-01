package com.jchz.leetcode.simple.$面试题01_09_字符串轮转;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 16:18
 * @see
 * @since
 */
public class Solution {
    public boolean isFlipedString(String s1, String s2) {
        return (s2 + s2).contains(s1);
    }

}
