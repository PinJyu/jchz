package com.jchz.leetcode.simple.$剑指OfferII0059_数据流的第K大数值;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-22 19:54
 * @see
 * @since
 */
public class Solution {

    class KthLargest {

        final int length;
        PriorityQueue<Integer> q = new PriorityQueue<>();

        public KthLargest(int k, int[] nums) {
            this.length = k;
            for (int i : nums) {
                add(i);
            }
        }

        public int add(int val) {

            q.offer(val);
            if (q.size() > length)
                q.poll();

            return q.peek();
        }
    }
}
