package com.jchz.leetcode.simple.$0703_数据流中的第K大元素;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-27 17:11
 */
public class Solution {
    class KthLargest {

        private PriorityQueue<Integer> heap = new PriorityQueue<>();

        private int k;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            for (int i : nums) {
                heap.offer(i);
                if (heap.size() > k) {
                    heap.poll();
                }
            }
        }

        public int add(int val) {
            heap.offer(val);
            if (heap.size() > k) {
                heap.poll();
            }

            return heap.peek();
        }
    }

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
}
