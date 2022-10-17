package com.jchz.leetcode.simple.$剑指Offer0009_用两个栈实现队列;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-17 11:37
 */
public class Solution {
    class CQueue {
        Deque<Integer> inq = new LinkedList<>();
        Deque<Integer> outq = new LinkedList<>();

        public CQueue() {

        }

        public void appendTail(int value) {
            inq.push(value);

        }

        public int deleteHead() {
            if (!outq.isEmpty())
                return outq.poll();
            while (!inq.isEmpty())
                outq.push(inq.pop());

            if (!outq.isEmpty())
                return outq.pop();
            else
                return -1;
        }
    }

}
