package com.jchz.leetcode.middle.$0120_三角形最小路径和;

import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-31 20:14
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> li = triangle.get(i), last = triangle.get(i - 1);
            int n = li.size();
            for (int j = 0; j < n; j++) {
                int old = li.get(j);
                int newV = old + Math.min(j == n - 1 ? Integer.MAX_VALUE : last.get(j), j == 0 ? Integer.MAX_VALUE : last.get(j - 1));
                li.set(j, newV);
            }
        }

        List<Integer> l = triangle.get(triangle.size() - 1);
        for (Integer i : l) {
            min = Math.min(min, i);
        }

        return min;
    }
}
