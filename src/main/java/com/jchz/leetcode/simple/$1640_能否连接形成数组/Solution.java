package com.jchz.leetcode.simple.$1640_能否连接形成数组;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-09 21:56
 * @see
 * @since
 */
public class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int[] map = new int[101];
        for (int i = 0; i < arr.length; i++) {
            map[arr[i]] = i + 1;
        }

        for (int[] piece : pieces) {
            int s = map[piece[0]] - 2;
            for (int i = 0; i < piece.length; i++) {
                if (piece[i] == 0)
                    break;
                if (map[piece[i]] == 0 || map[piece[i]] - 1 != ++s) {
                    return false;
                }
            }
        }

        return true;
    }
}
