package com.jchz.leetcode.simple.$0999_可以被一步捕获的棋子数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-04 16:32
 */
public class Solution {
    public int numRookCaptures(char[][] board) {
        int px = 0, py = 0;
        int[] x_ = {1, 0, -1, 0}, y_ = {0, 1, 0, -1};
    outter:
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    px = i; py = j;
                    break outter;
                }
            }
        }

        int res = 0;
        for (int i = 0; i < x_.length; i++) {
            int cpx = px, cpy = py;
            while (cpx >= 0 && cpx < 8 && cpy >=0 && cpy < 8) {
                char c = board[cpx][cpy];
                if (c == 'B') {
                    break;
                }
                else if (c == 'p') {
                    res++;
                    break;
                }
                cpx += x_[i];
                cpy += y_[i];
            }
        }

        return res;
    }
}
