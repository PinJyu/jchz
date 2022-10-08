package com.jchz.leetcode.simple.$0682_棒球比赛;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-27 13:37
 */
public class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        Deque<Integer> s = new LinkedList<>();
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];
            switch (op) {
                case "C" : {
                    sum -= s.pop();
                    break;
                }
                case "D" : {
                    sum += s.peek() * 2;
                    s.push(s.peek() * 2);
                    break;
                }
                case "+" : {
                    Integer top = s.pop();
                    Integer second = s.pop();
                    s.push(second);
                    s.push(top);
                    s.push(top + second);
                    sum += s.peek();
                    break;
                }
                default  : {
                    s.push(Integer.valueOf(op));
                    sum += s.peek();
                }
            }
        }

        return sum;
    }
}
