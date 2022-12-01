package com.jchz.leetcode.simple.$1662_检查两个字符串数组是否相等;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-09 23:01
 * @see
 * @since
 */
public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        for (String s : word1) {
            sb.append(s);
        }

        int index = 0;
        for (String s : word2) {
            for (char c : s.toCharArray()) {
                if (index >= sb.length() || sb.charAt(index++) != c)
                    return false;
            }
        }

        return index == sb.length();
    }
}
