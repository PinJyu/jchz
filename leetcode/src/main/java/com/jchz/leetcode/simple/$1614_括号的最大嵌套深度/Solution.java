package com.jchz.leetcode.simple.$1614_括号的最大嵌套深度;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-09 18:02
 */
public class Solution {
    public int maxDepth(String s) {
        int max = Integer.MIN_VALUE, stack = 0;
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack++;
            else if (c == ')')
                stack--;
            max = Math.max(stack, max);
        }

        return max;
    }
}
