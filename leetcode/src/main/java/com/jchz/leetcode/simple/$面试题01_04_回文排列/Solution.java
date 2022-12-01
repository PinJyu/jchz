package com.jchz.leetcode.simple.$面试题01_04_回文排列;

import com.sun.scenario.effect.impl.prism.PrReflectionPeer;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 15:52
 * @see
 * @since
 */
public class Solution {
    public boolean canPermutePalindrome(String s) {
        int[] map = new int[26];
        for (char c : s.toCharArray()) {
            map[c - 'a']++;
        }

        int count = 0;
        for (int i : map) {
            if (i % 2 == 1) {
                count++;
                if (count > 1)
                    return false;
            }
        }

        return true;
    }
}
