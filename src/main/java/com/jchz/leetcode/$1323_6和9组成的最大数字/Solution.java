package com.jchz.leetcode.$1323_6和9组成的最大数字;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 20:29
 */
public class Solution {
    public int maximum69Number (int num) {
        int index = 1, index6 = 0, num_ = num;
        while (num > 0) {
            int mode = num % 10;
            num /= 10;
            if (mode == 6) {
                index6 = index;
            }
            index *= 10;
        }
        return num_ + 3 * index6;
    }
}
