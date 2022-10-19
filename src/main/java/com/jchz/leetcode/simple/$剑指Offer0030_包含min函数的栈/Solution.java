package com.jchz.leetcode.simple.$剑指Offer0030_包含min函数的栈;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-18 10:36
 */
public class Solution {

    class MinStack {

        Deque<Integer> stack = new LinkedList<>(), minStack = new LinkedList<>();

        public MinStack() {

        }

        public void push(int x) {
            stack.push(x);
            Integer peek = minStack.peek();
            minStack.push(peek != null ? Math.min(x, peek) : x);
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            return minStack.peek();
        }
    }
}
