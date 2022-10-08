package com.jchz.leetcode.simple.$1009_十进制整数的反码;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-04 18:14
 */
public class Solution {
    public int bitwiseComplement(int n) {
        int i = 1;
        while (i < n)
           i <<= 1;
        return i > 1 ? i - 1 - n : 1;
    }
}
