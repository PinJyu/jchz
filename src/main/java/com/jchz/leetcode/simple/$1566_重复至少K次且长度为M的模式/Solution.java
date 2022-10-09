package com.jchz.leetcode.simple.$1566_重复至少K次且长度为M的模式;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-09 10:24
 */
public class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
    f1:
        for (int i = 0; i < arr.length - m * k; i++) {
            for (int j = 0; j < m; j++) {
                for (int a = 1; a < k; a++) {
                    if (arr[i + j] != arr[i + j + a * m]) {
                        continue f1;
                    }
                }
            }

            return true;
        }

        return false;
    }
}
