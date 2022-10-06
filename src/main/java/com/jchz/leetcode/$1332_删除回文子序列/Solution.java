package com.jchz.leetcode.$1332_删除回文子序列;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 21:49
 */
public class Solution {
    public static void main(String[] args) {
        new Solution().removePalindromeSub("ababa");
    }

    // 弱智题
    public int removePalindromeSub_1(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; ++i) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return 2;
            }
        }
        return 1;
    }

    public int removePalindromeSub(String s) {
        char[] cs = s.toCharArray();

        int count = 0;
        for (int i = 0; i < cs.length; i++) {
            for (int j = cs.length - 1; j >= 0; j--) {
                if (is(cs, i, j)) {
                    i = j;
                    break;
                }
            }
            count += 1;
        }

        return count;
    }

    boolean is(char[] cs, int b, int e) {
        while (b < e) {
            if (cs[b] != cs[e])
                return false;
            b++; e--;
        }
        return true;
    }
}
