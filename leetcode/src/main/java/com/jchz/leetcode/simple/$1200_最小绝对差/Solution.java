package com.jchz.leetcode.simple.$1200_最小绝对差;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 22:45
 */
public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int absDiff = Math.abs(arr[i] - arr[i + 1]);
            if (absDiff < min) {
                res = new ArrayList<>();
                res.add(Arrays.asList(arr[i], arr[i + 1]));
                min = absDiff;
            }
            else if (absDiff == min) {
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }


        return res;
    }
}
