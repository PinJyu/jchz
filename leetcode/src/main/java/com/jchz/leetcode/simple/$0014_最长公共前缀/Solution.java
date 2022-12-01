package com.jchz.leetcode.simple.$0014_最长公共前缀;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-09 13:31
 */
public class Solution {
    // 校验和
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if (strs.length == 0)
            return sb.toString();

        String firstString = strs[0];
    indexlabel:
        for (int i = 0; i < 200; i++) {
            if (firstString.length() <= i)
                break;

            char checkSum = firstString.charAt(i);
            for (String str : strs) {
                try {
                    char c = str.charAt(i);
                    if ((checkSum ^ c) != 0)
                        break indexlabel;
                } catch (IndexOutOfBoundsException ignore) {
                    break indexlabel;
                }
            }
            sb.append(checkSum);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        new Solution().longestCommonPrefix_1(new String[]{"cir","car"});
    }

    // 切成前两个str的公共前缀和后面数组中的公共前缀
    public String longestCommonPrefix_1(String[] strs) {
        if (strs.length == 0)
            return "";

        int index = 0;
        String prefix = "";
        while (index < strs.length - 1) {
            prefix = longestCommonPrefix_2(strs[index], strs[++index]);
            strs[index] = prefix;
            if ("".equals(prefix))
                break;
        }

        return prefix;
    }

    public String longestCommonPrefix_2(String first, String second) {
        int count = 0;
        for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
            if (first.charAt(i) == second.charAt(i))
                count++;
        }
        return first.substring(0, count);
    }
}
