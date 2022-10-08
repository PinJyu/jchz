package com.jchz.leetcode.simple.$0693_交替位二进制数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-27 13:57
 */
public class Solution {
    public boolean hasAlternatingBits(int n) {
        int mask1 = 0b11;
        int checkSum = 0;

        while (n > 0) {
            int l = n & mask1;
            if (l == mask1 || l == 0)
                return false;
            if ((checkSum = (checkSum | l)) != l)
                return false;

            n >>= 2;
        }

        return true;
    }
}
