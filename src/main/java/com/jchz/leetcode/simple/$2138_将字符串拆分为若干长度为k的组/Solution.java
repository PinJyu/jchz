package com.jchz.leetcode.simple.$2138_将字符串拆分为若干长度为k的组;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-13 23:23
 * @see
 * @since
 */
public class Solution {
    public String[] divideString(String s, int k, char fill) {
        char[] cs = s.toCharArray();
        int mode = cs.length % k;
        int len = cs.length / k + mode == 0 ? 0 : 1;
        String[] ret = new String[len];
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < cs.length; i++) {
            sb.append(cs[i]);
            if (sb.length() == k) {
                ret[index++] = sb.toString();
                sb = new StringBuilder();
            }
        }
        if (sb.length() > 0) {
            for (int i = sb.length(); i < k; i++) {
                sb.append(fill);
            }
            ret[index] = sb.toString();
        }


        return ret;
    }
}
