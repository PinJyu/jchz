package com.jchz.leetcode.$0657_机器人能否返回原点;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-26 16:35
 */
public class Solution {
    public boolean judgeCircle(String moves) {
        int r = 0, l = 0, u = 0, d = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'R') r++;
            if (c == 'L') l++;
            if (c == 'U') u++;
            if (c == 'D') d++;
        }
        return r == l && u == d;
    }
}
