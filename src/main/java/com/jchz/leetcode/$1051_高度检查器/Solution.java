package com.jchz.leetcode.$1051_高度检查器;

import java.util.PriorityQueue;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 16:45
 */
public class Solution {
    public int heightChecker(int[] heights) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int height : heights) {
            pq.offer(height);
        }

        int count = 0;
        for (int height : heights) {
            if (height != pq.poll())
                count++;
        }

        return count;
    }
}
