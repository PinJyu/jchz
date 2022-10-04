package com.jchz.leetcode.$1021_删除最外层的括号;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-04 19:10
 */
public class Solution {
    public static void main(String[] args) {
        new Solution().removeOuterParentheses("(()())(())(()(()))");
    }
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        char[] cs = s.toCharArray();
        int stack = 0;
        for (char c : cs) {
            if (c == ')') {
                stack--;
                if (stack != 0)
                    sb.append(c);

            }
            else {
                if (stack != 0)
                    sb.append(c);
                stack++;
            }
        }

        System.out.println(sb);

        return sb.toString();
    }
}
