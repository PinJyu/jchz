package com.jchz.leetcode.simple.$1047_删除字符串中的所有相邻重复项;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 15:50
 */
public class Solution {
    public static void main(String[] args) {
        new Solution().removeDuplicates(
                "abbaca");
    }
    public String removeDuplicates(String s) {
        char[] cs = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int top = -1;
        for (char c : cs) {
            if (top >= 0 && c == sb.charAt(top)) {
                sb.deleteCharAt(top);
                top--;
            }
            else {
                sb.append(c);
                top++;
            }
        }

        return sb.toString();

    }
}
