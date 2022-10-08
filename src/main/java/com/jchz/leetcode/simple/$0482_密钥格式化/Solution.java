package com.jchz.leetcode.simple.$0482_密钥格式化;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-20 16:07
 */
public class Solution {

    public String licenseKeyFormatting(String s, int k) {
        char[] cs = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cs.length; i++) {
            char c = cs[cs.length - 1 - i];
            if (c != '-') {
                sb.append((char) (c - 'a' < 26 && c - 'a' >= 0 ? 'A' + c - 'a' : c));
                if (sb.length() % (k + 1) == k)
                    sb.append('-');
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '-')
            sb.deleteCharAt(sb.length() - 1);

        return sb.reverse().toString();
    }
}
