package com.jchz.leetcode.simple.$剑指OfferII0042_最近请求次数;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-22 19:10
 * @see
 * @since
 */
public class Solution {
    class RecentCounter {

        Queue<Integer> q = new LinkedList<>();
        public RecentCounter() {

        }

        public int ping(int t) {
            q.offer(t);
            t -= 3000;
            while (q.peek() < t) {
                q.poll();
            }

            return q.size();
        }
    }

}
