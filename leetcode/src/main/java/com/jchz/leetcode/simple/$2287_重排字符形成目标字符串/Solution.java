package com.jchz.leetcode.simple.$2287_重排字符形成目标字符串;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-14 21:30
 * @see
 * @since
 */
public class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] map = new int[26];
        for (char c : s.toCharArray()) {
            map[c - 'a']++;
        }
        int[] mapt = new int[26];

        for (char c : target.toCharArray()) {
            mapt[c - 'a']++;
        }


        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mapt.length; i++) {
            if (mapt[i] > 0) {
                min = Math.min(min, map[i] / mapt[i]);
            }
        }


        return min;
    }

}
