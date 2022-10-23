package com.jchz.leetcode.simple.$面试题01_06_字符串压缩;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 16:01
 * @see
 * @since
 */
public class Solution {

    public String compressString(String S) {
        if (S.length() == 0)
            return S;
        char[] cs = S.toCharArray();
        StringBuilder sb = new StringBuilder().append(cs[0]);
        int count = 1;
        for (int i = 1; i < cs.length; i++) {
            if (cs[i] == sb.charAt(sb.length() - 1))
                count++;
            else {
                sb.append(count);
                sb.append(cs[i]);
                count = 1;
            }
        }
        sb.append(count);

        return sb.length() > S.length() ? S : sb.toString();
    }

}
