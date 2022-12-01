package com.jchz.leetcode.simple.$0557_反转字符串中的单词III;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-23 11:26
 */
public class Solution {
    public String reverseWords(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(c);
            }
            else
                stack.push(c);
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();

    }

    public String reverseWords_1(String s) {

        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            if (c == ' ') {
            }
            else {
                int j = i + 1;
                while (j < cs.length && cs[j] != ' ') {
                    j++;
                }

                final int nextI = j;


                j--;
                while (i < j) {
                    char t = cs[i];
                    cs[i] = cs[j];
                    cs[j] = t;
                    i++;
                    j--;
                }
                i = nextI;
            }
        }

        return new String(cs);

    }
}
