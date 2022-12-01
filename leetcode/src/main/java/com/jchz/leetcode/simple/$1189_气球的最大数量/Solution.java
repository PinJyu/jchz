package com.jchz.leetcode.simple.$1189_气球的最大数量;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 22:38
 */
public class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] map = new int[26];

        for (char c : text.toCharArray()) {
            map[c- 'a']++;
        }

        int count = Integer.MAX_VALUE;
        for (char c : "balloon".toCharArray()) {
            int div = c == 'l' || c == 'o' ? 2 : 1;
            count = Math.min(map[c] / div, count);
        }

        return count;
    }
}
