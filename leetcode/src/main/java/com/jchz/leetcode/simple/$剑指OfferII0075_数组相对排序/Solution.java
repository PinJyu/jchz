package com.jchz.leetcode.simple.$剑指OfferII0075_数组相对排序;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-22 21:07
 * @see
 * @since
 */
public class Solution {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < arr2.length; j++) {
            map.put(arr2[j], j);
        }

        return Arrays.stream(arr1).boxed().sorted((x, y) -> {
            Integer x_ = map.get(x), y_ = map.get(y);
            if (x_ != null && y_ != null)
                return x_ - y_;

            if (x_ == null && y_ == null) {
                return (int) x - (int) y;
            }

            return x_ == null ? 1 : -1;
        }).mapToInt(Integer::intValue).toArray();
    }

    public int[] relativeSortArray_1(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int[] ret = new int[arr1.length];

        int index = 0;
        for (int i : arr2) {
            Integer j = map.get(i);
            map.remove(i);
            for (Integer integer = 0; integer < j; integer++) {
                ret[index++] = i;
            }
        }

        int sortTail = index;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            for (Integer integer = 0; integer < entry.getValue(); integer++) {
                ret[index++] = entry.getKey();
            }
        }

        Arrays.sort(ret, sortTail, ret.length);

        return ret;
    }

}
