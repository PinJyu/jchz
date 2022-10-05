package com.jchz.leetcode.$1071_字符串的最大公因子;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 16:55
 */
public class Solution {
    public static void main(String[] args) {
        new Solution().gcdOfStrings("ababab", "ab");
    }

    public String gcdOfStrings(String str1, String str2) {
        String p = str1.substring(0, gcd(str1.length(), str2.length()));
        if (check(p, str1) && check(p, str2))
            return p;

        return "";
    }

    boolean check(String p, String s) {
        int c = s.length() / p.length();
        String concat = "";
        for (int i = 0; i < c; i++) {
            concat += p;
        }

        return concat.equals(s);
    }
    int gcd(int a, int b) {
        int re = a % b;

        while (re != 0) {
            a = b;
            b = re;
            re = a % b;
        }

        return b;
    }
}
