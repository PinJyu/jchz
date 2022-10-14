package com.jchz.leetcode.simple.$2335_装满杯子需要的最短总时长;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-14 22:53
 * @see
 * @since
 */
public class Solution {
    public int fillCups_1(int[] amount) {
        Arrays.sort(amount);
        if (amount[2] >= amount[0] + amount[1])
            return amount[2];

        return (int) Math.ceil((amount[0] + amount[1] + amount[2]) / 2);
    }
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x, y) -> -x.compareTo(y));
        for (int i : amount) {
            maxHeap.offer(i);
        }

        int mins = 0;
        while (!maxHeap.isEmpty()) {
            Integer first = maxHeap.poll();
            Integer second = 0;

            if (!maxHeap.isEmpty())
                second = maxHeap.poll();

            --first;
            --second;
            if (first >= 0) {
                mins += 1;
            }

            if (first > 0)
                maxHeap.offer(first);
            if (second > 0)
                maxHeap.offer(second);
        }

        return mins;
    }

}
