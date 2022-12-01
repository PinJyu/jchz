package com.jchz.leetcode.simple.$0020_有效的括号;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-09 14:30
 */
public class Solution {

    public static void main(String[] args) {
        boolean valid = new Solution().isValid("()");
    }
    public boolean isValid(String s) {
//        '()[]{}'
        Deque<Character> stack = new ArrayDeque<>(s.length());
        int i;
        for (i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{')
                stack.addLast(c);
            else {
                Character last = stack.peekLast();
                char shouldLast = 0;
                switch (c) {
                    case ')' : shouldLast = '('; break;
                    case ']' : shouldLast = '['; break;
                    case '}' : shouldLast = '{'; break;
                }
                if (shouldLast == last) {
                    stack.pollLast();
                }
                else {
                    break;
                }
            }
        }

        return i == s.length() && stack.size() == 0;
    }
}
