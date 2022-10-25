package com.jchz.leetcode.simple.$面试题03_02_栈的最小值;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 17:17
 * @see
 * @since
 */
public class Solution {

    class MinStack {

        Deque<Integer> stack, minStack;
        /** initialize your data structure here. */
        public MinStack() {
            stack = new LinkedList<>();
            minStack = new LinkedList<>();
        }

        public void push(int x) {
            stack.push(x);
            Integer min = minStack.peek();
            minStack.push(min == null ? x : Math.min(x, min));
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
}
