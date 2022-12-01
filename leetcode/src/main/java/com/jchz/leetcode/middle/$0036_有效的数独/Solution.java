package com.jchz.leetcode.middle.$0036_有效的数独;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-27 20:01
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            int[] rmap = new int[128];
            int[] cmap = new int[128];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    rmap[board[i][j]]++;
                    if (rmap[board[i][j]] > 1)
                        return false;
                }
                if (board[j][i] != '.') {
                    cmap[board[j][i]]++;
                    if (cmap[board[j][i]] > 1)
                        return false;
                }

                int rs = i / 3 * 3, re = j / 3 * 3;
                if ((rs == i && re == j)) {
                    int[] smap = new int[128];
                    for (int m = rs; m < rs + 3; m++) {
                        for (int n = re; n < re + 3; n++) {
                            if (board[m][n] != '.') {
                                smap[board[m][n]]++;
                                if (smap[board[m][n]] > 1)
                                    return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}
