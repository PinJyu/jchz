package com.jchz.leetcode.simple.$1678_设计Goal解析器;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-09 23:53
 * @see
 * @since
 */
public class Solution {
    public String interpret(String command) {
        Deque<Character> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        char[] cs = command.toCharArray();
        for (char c : cs) {
           if (c == 'G')
               sb.append(c);
           else {
               q.offer(c);
               if (c == ')') {
                   sb.append(q.size() == 2 ? 'o' : "al");
                   q.clear();
               }
           }
        }

        return sb.toString();
    }
}
