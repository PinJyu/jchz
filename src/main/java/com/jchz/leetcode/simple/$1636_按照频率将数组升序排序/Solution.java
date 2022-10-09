package com.jchz.leetcode.simple.$1636_按照频率将数组升序排序;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-09 21:47
 * @see
 * @since
 */
public class Solution {
    public int[] frequencySort(int[] nums) {
        List<Pair<Integer, Integer>> l = new ArrayList<>();

        int[] arr = new int[201];
        for (int num : nums) {
            arr[num + 100]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                l.add(new Pair<>(i - 100, arr[i]));
            }
        }

        l.sort((x, y) -> {
            if (x.getValue().equals(y.getValue()))
                return y.getKey() - x.getKey();
            return x.getValue() - y.getValue();
        });

        int[] ret = new int[nums.length];

        int index = 0;
        for (Pair<Integer, Integer> pair : l) {
            for (Integer i = 0; i < pair.getValue(); i++) {
                ret[index++] = pair.getKey();
            }
        }

        return ret;
    }
}
