package com.jchz.leetcode.$0717_1比特与2比特字符;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-27 18:24
 */
public class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        for (int i = 0; i < bits.length; i++) {
            if (bits.length - 1 == i)
                return true;
            if (bits[i] == 1)
                i++;
        }

        return false;
    }
}
