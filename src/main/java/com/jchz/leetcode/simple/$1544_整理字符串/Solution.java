package com.jchz.leetcode.simple.$1544_整理字符串;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-08 22:23
 * @see
 * @since
 */
public class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();

        for (char  c : s.toCharArray()) {
            if (sb.length() == 0) {
                sb.append(c);
                continue;
            }
            char top = sb.charAt(sb.length() - 1);
            if (c != top && (c | 32) == (top | 32)) // c ^ top == 32
                sb.deleteCharAt(sb.length() - 1);
            else
                sb.append(c);
        }


        return sb.toString();
    }
}
