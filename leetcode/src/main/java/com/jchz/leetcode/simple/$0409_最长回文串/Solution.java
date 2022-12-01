package com.jchz.leetcode.simple.$0409_最长回文串;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-19 18:24
 */
public class Solution {
    public int longestPalindrome(String s) {
        char[] cs = s.toCharArray();
        int[] map = new int[128];

        for (char c : cs) {
            map[c]++;
        }

        int res = 0;
        int maxEven = 0;
        for (int j : map) {
            if (j % 2 == 0) {
                res += j;
            } else {
                res += j / 2 * 2;
                if (res % 2 == 0)
                    res++;
            }
        }

        return res + maxEven;
    }

    public static void main(String[] args) {
        new Solution().longestPalindrome("abccccdd");
    }
}
