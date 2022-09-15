package com.jchz.leetcode.$0225_用队列实现栈;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-14 16:21
 */
public class Solution {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.top());
    }
    static class MyStack {

        private Queue<Integer> inQueue;

        private Queue<Integer> outQueue;

        public MyStack() {
            this.inQueue = new LinkedList<>();
            this.outQueue = new LinkedList<>();
        }

        public void push(int x) {
            this.inQueue.add(x);
        }

        public int pop() {

            int size = inQueue.size();
            for (int i = 0; i < size - 1; i++) {
                outQueue.add(inQueue.poll());
            }

            Integer top = inQueue.poll();

            this.inQueue = this.outQueue;
            this.outQueue = new LinkedList<>();
            return top == null ? -1 : top;
        }

        public int top() {
            int pop = this.pop();
            this.inQueue.add(pop);
            return pop;
        }

        public boolean empty() {
            return this.inQueue.isEmpty();
        }
    }

    static class MyStack_1 {

        private Queue<Integer> cycleQueue;

        public MyStack_1() {
            this.cycleQueue = new LinkedList<>();
        }

        public void push(int x) {
            cycleQueue.add(x);
        }

        public int pop() {

            int size = cycleQueue.size();
            for (int i = 0; i < size - 1; i++) {
                cycleQueue.add(cycleQueue.poll());
            }

            Integer top = cycleQueue.poll();
            return top == null ? -1 : top;
        }

        public int top() {
            int pop = this.pop();
            this.cycleQueue.add(pop);
            return pop;
        }

        public boolean empty() {
            return this.cycleQueue.isEmpty();
        }
    }
}
