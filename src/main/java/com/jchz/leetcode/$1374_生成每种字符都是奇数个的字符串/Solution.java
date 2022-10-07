package com.jchz.leetcode.$1374_生成每种字符都是奇数个的字符串;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 15:56
 * @see
 * @since
 */
public class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            sb.append('a');
        }
        if (n % 2 == 0)
            sb.append('b');
        else
            sb.append('a');
        return sb.toString();
    }
}
