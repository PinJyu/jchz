package com.jchz.leetcode.simple.$0821_字符的最短距离;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-29 15:42
 */
public class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];


        int last = -1;
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            char n = cs[i];
            if (n == c) {
                res[i] = 0;
                if (last == -1) {
                    last = -i;
                }
                fill(res, last, i);
                last = i;
            }
            if (i == cs.length - 1 && n != c) {
                fill(res, last, cs.length * 2 - i);
            }
        }

        return res;
    }

    private void fill(int[] arr, int l, int r) {
        int from = 0;

        while (l <= r) {
            if (l > -1 && l < arr.length)
                arr[l] = from;
            if (r > -1 && r < arr.length)
                arr[r] = from;
            l++; r--; from++;
        }

    }
}
