package com.jchz.leetcode.simple.$1624_两个相同字符之间的最长子字符串;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-09 18:06
 */
public class Solution {
    public int maxLengthBetweenEqualCharacters_1(String s) {
        int[] map = new int[26];
        Arrays.fill(map, -1);
        char[] cs = s.toCharArray();
        int max = -1;
        for (int i = 0; i < cs.length; i++) {
            if (map[cs[i] - 'a'] < 0)
                map[cs[i] - 'a'] = i;
            else {
                max = Math.max(max, i - map[cs[i] - 'a'] - 1);
            }
        }

        return max;
    }

    public int maxLengthBetweenEqualCharacters(String s) {
        char[] cs = s.toCharArray();
        int max = -1;
        for (int i = 0; i < cs.length; i++) {
            if (max > cs.length - 1 - i)
                break;
            for (int j = cs.length - 1; j > i; j--) {
                if (cs[i] == cs[j])
                    max = Math.max(max, j - i - 1);
            }
        }

        return max;
    }
}
