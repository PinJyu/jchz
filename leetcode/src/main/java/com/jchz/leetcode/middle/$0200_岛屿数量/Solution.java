package com.jchz.leetcode.middle.$0200_岛屿数量;

import java.util.BitSet;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-01 18:31
 */
public class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length, m = grid[0].length, ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    // System.out.printf("%d, %d\n", i, j);
                    mark(grid, i, j, n, m);
                    ans++;
                }
            }
        }

        return ans;
    }

    void mark(char[][] arr, int x, int y, int n, int m) {
        if (x < 0 || x >= n || y < 0 || y >= m || arr[x][y] == '0')
            return;

        arr[x][y] = '0';
        mark(arr, x - 1, y, n, m);
        mark(arr, x + 1, y, n, m);
        mark(arr, x, y - 1, n, m);
        mark(arr, x, y + 1, n, m);
        BitSet bitSet = new BitSet();
    }
}
