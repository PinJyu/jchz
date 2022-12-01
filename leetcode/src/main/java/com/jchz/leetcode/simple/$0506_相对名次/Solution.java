package com.jchz.leetcode.simple.$0506_相对名次;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-21 14:22
 */
public class Solution {
    public String[] findRelativeRanks(int[] score) {
        int len = score.length;
        @SuppressWarnings("uncheck")
        Pair<Integer, Integer>[] pairs = new Pair[len];
        for (int i = 0; i < score.length; i++) {
            pairs[i] = new Pair<>(score[i], i);
        }

        Arrays.sort(pairs, Collections.reverseOrder(Comparator.comparingInt(Pair::getKey)));

        String[] res = new String[len];
        for (int i = 0; i < pairs.length; i++) {
            if (i == 0) {
                res[pairs[i].getValue()] = "Gold Medal";
            }
            else if (i == 1) {
                res[pairs[i].getValue()] = "Silver Medal";
            }
            else if (i == 2) {
                res[pairs[i].getValue()] = "Bronze Medal";
            }
            else {
                res[pairs[i].getValue()] = i + 1 + "";
            }
        }

        return res;
    }
}
