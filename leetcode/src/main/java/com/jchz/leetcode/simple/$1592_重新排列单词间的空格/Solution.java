package com.jchz.leetcode.simple.$1592_重新排列单词间的空格;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-09 17:04
 */
public class Solution {
    public String reorderSpaces(String text) {
        String[] s = text.trim().split("\\s+");
        int spaceCount = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ')
                spaceCount++;
        }
        int mode = s.length == 1 ? spaceCount : spaceCount % (s.length - 1);
        spaceCount = s.length == 1 ? 0 : spaceCount / (s.length - 1);
        StringBuilder sb = new StringBuilder().append(s[0]);

        for (int i = 1; i < s.length; i++) {
            for (int j = 0; j < spaceCount; j++) {
                sb.append(' ');
            }
            sb.append(s[i]);
        }

        for (int i = 0; i < mode; i++) {
            sb.append(' ');
        }

        return sb.toString();
    }
}
