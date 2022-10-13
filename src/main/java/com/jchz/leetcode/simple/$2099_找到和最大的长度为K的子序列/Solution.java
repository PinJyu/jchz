package com.jchz.leetcode.simple.$2099_找到和最大的长度为K的子序列;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-13 22:06
 * @see
 * @since
 */
public class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Pair<Integer, Integer>> heap = new PriorityQueue<>((o1, o2) -> -o1.getKey().compareTo(o2.getKey()));

        for (int i = 0; i < nums.length; i++) {
            heap.offer(new Pair<>(nums[i], i));
        }

        List<Pair<Integer, Integer>> l = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            l.add(heap.poll());
        }

        l.sort(Comparator.comparingInt(Pair::getValue));

        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = l.get(i).getKey();
        }

        return ret;
    }

}
