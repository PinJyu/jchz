package com.jchz.leetcode.simple.$面试题03_01_三合一;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 16:59
 * @see
 * @since
 */
public class Solution {
    class TripleInOne {

        int[] arr;
        int[] nextIndex = new int[3];
        int stackSize;
        public TripleInOne(int stackSize) {
            arr = new int[stackSize * 3];
            this.stackSize = stackSize;
            nextIndex[1] = stackSize;
            nextIndex[2] = stackSize * 2;
        }

        public void push(int stackNum, int value) {
            int upBound = (stackNum + 1) * stackSize - 1;
//            int lowBound = stackNum * stackSize;
            int topIndex = this.nextIndex[stackNum];
            if (topIndex > upBound)
                return;
            arr[topIndex] = value;
            this.nextIndex[stackNum]++;
        }

        public int pop(int stackNum) {
            int lowBound = stackNum * stackSize;
            int topIndex = this.nextIndex[stackNum];
            if (topIndex == lowBound)
                return -1;
            topIndex--;
            this.nextIndex[stackNum] = topIndex;
            return arr[topIndex];
        }

        public int peek(int stackNum) {
            int lowBound = stackNum * stackSize;
            int topIndex = this.nextIndex[stackNum];
            if (topIndex == lowBound)
                return -1;
            return arr[topIndex - 1];

        }

        public boolean isEmpty(int stackNum) {
            int lowBound = stackNum * stackSize;
            int topIndex = this.nextIndex[stackNum];
            return topIndex == lowBound;
        }
    }

}
