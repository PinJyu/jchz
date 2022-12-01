package com.jchz.leetcode.simple.$1720_解码异或后的数组;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 15:53
 */
public class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] ret = new int[encoded.length + 1];
        ret[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            ret[i + 1] = encoded[i] ^ ret[i];
        }

        return ret;
    }
}
