package com.jchz.leetcode.simple.$面试题16_11_跳水板;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-24 15:11
 */
public class Solution {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0)
            return new int[0];
        if (shorter == longer)
            return new int[]{k * shorter};

        int[] ret = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            ret[i] = i * longer + (k - i) * shorter;
        }

        return ret;
    }

//    void backTrace(int sum, int shorter, int longer, int k, int ks, List<Integer> set) {
//        if (ks > k) {
//            if (set.size() > 0) {
//                Integer i = set.get(set.size() - 1);
//                if (i != sum)
//                    set.add(sum);
//            }
//            else if (sum != 0) {
//                set.add(sum);
//            }
//            return;
//        }
//
//        backTrace(sum + shorter, shorter, longer, k, ks + 1, set);
//        if (shorter != longer)
//            backTrace(sum + longer, shorter, longer, k, ks + 1, set);
//    }
//
}
