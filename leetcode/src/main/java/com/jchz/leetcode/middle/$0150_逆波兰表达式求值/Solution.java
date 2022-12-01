package com.jchz.leetcode.middle.$0150_逆波兰表达式求值;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-01 15:11
 */
public class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> q = new ArrayDeque<>();

        for (String s : tokens) {
            // System.out.println(q);
            // System.out.println(s);
            if (s.length() == 1 && "+-*/".contains(s)) {
                Integer op1 = q.pop(), op2 = q.pop();
                int res = 0;
                switch (s) {
                    case "+" : res = op1 + op2; break;
                    case "-" : res = op2 - op1; break;
                    case "*" : res = op1 * op2; break;
                    case "/" : res = op2 / op1; break;
                }
                q.push(res);
            }
            else
                q.push(Integer.parseInt(s));
        }

        return q.pop();
    }
}
