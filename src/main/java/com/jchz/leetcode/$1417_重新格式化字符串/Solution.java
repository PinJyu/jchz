package com.jchz.leetcode.$1417_重新格式化字符串;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 18:28
 * @see
 * @since
 */
public class Solution {
    public String reformat(String s) {
        int stack = 0, letterIndex = 0, digitIndex = 1;
        char[] cs = new char[s.length()];
        char lastDigit = 'd';
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                stack++;
                if (letterIndex < cs.length) {
                    cs[letterIndex] = c;
                    letterIndex += 2;
                }
            }
            else {
                stack--;
                if (digitIndex < cs.length) {
                    cs[digitIndex] = c;
                    digitIndex += 2;
                }
                else
                    lastDigit = c;
            }
        }

        if (stack == 1 || stack == 0) {
            return new String(cs);
        }
        else if (stack == -1) {
            for (int i = 0; i < cs.length - 1; i += 2) {
                char t = cs[i];
                cs[i] = cs[i + 1];
                cs[i + 1] = t;
            }
            cs[cs.length - 1] = lastDigit;
            return new String(cs);
        }
        else
            return "";
    }
}
