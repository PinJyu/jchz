package com.jchz.leetcode.$1260_二维网格迁移;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 15:42
 */
public class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        k %= m * n;
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                q.offer(grid[i][j]);
            }
        }

        while (k > 0) {
            q.offerFirst(q.pollLast());
            k--;
        }

        for (int i = 0; i < m; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                l.add(q.poll());
            }
            res.add(l);
        }

        return res;
    }
}
