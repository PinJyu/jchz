package com.jchz.leetcode.simple.$0232_用栈实现队列;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-15 15:00
 */
public class Solution {
    class MyQueue {

        private Deque<Integer> inS = new LinkedList<>();
        private Deque<Integer> outS = new LinkedList<>();

        public MyQueue() {

        }

        public void push(int x) {
            while (!outS.isEmpty()) {
                inS.push(outS.pop());
            }

            inS.push(x);

            while (!inS.isEmpty()) {
                outS.push(inS.pop());
            }

        }

        public int pop() {
            return outS.pop();
        }

        public int peek() {
            return outS.peek();
        }

        public boolean empty() {
            return outS.isEmpty();
        }
    }
}
