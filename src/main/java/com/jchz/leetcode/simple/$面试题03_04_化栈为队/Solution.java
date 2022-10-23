package com.jchz.leetcode.simple.$面试题03_04_化栈为队;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 17:24
 * @see
 * @since
 */
public class Solution {
    class MyQueue {

        Deque<Integer> inq, outq;
        /** Initialize your data structure here. */
        public MyQueue() {
            inq = new LinkedList<>();
            outq = new LinkedList<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            inq.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if (outq.isEmpty()) {
                while (!inq.isEmpty())
                    outq.push(inq.pop());
            }

            return outq.pop();
        }

        /** Get the front element. */
        public int peek() {
            if (outq.isEmpty()) {
                while (!inq.isEmpty())
                    outq.push(inq.pop());
            }

            return outq.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return inq.isEmpty() && outq.isEmpty();
        }
    }

}
