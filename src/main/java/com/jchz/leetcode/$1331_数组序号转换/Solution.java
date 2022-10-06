package com.jchz.leetcode.$1331_数组序号转换;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 20:37
 */
public class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortArr = new int[arr.length];
        System.arraycopy(arr, 0, sortArr, 0, arr.length);
        Arrays.sort(sortArr);
        Map<Integer, Integer> map = new HashMap<>();

        int rank = 1;
        for (int i : sortArr) {
            if (!map.containsKey(i)) {
                map.put(i, rank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}
