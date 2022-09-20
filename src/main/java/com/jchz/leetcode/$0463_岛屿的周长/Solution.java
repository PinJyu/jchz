package com.jchz.leetcode.$0463_岛屿的周长;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-20 15:11
 */
public class Solution {
    public int islandPerimeter(int[][] grid) {
        int s = 0;
        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            for (int j = 0; j < row.length; j++) {
                if (row[j] == 1){
                    s += 4;

                    // up
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        s--;
                    }
                    // down
                    if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                        s--;
                    }
                    // left
                    if (j - 1 >= 0 && row[j - 1] == 1) {
                        s--;
                    }
                    // right
                    if (j + 1 < row.length && row[j + 1] == 1) {
                        s--;
                    }

                }
            }
        }

        return s;
    }

    public int islandPerimeter_1(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            for (int j = 0; j < row.length; j++) {
                if (row[j] == 1){
                    return dfs(grid, i, j); // 一个岛屿，只dfs一次
                }
            }
        }

        return 0;
    }

    private int dfs(int[][] grid, int r, int c) {

        if (!(r >= 0 && r < grid.length && c >= 0 && c < grid[0].length))
            return 1;

        if (grid[r][c] == 2) {
            return 0;
        }

        if (grid[r][c] == 0) {
            return 1;
        }

        grid[r][c] = 2;
        return dfs(grid, r + 1, c)
                + dfs(grid, r - 1, c)
                + dfs(grid, r, c + 1)
                + dfs(grid, r, c - 1);
    }
}
