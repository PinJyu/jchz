package com.jchz.leetcode.simple.$面试题01_02_判定是否互为字符重排;

import java.util.Arrays;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 15:37
 * @see
 * @since
 */
public class Solution {

    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        char[] cs1 = s1.toCharArray(), cs2 = s2.toCharArray();
        Arrays.sort(cs1);
        Arrays.sort(cs2);

        return Arrays.equals(cs1, cs2);
    }
}
