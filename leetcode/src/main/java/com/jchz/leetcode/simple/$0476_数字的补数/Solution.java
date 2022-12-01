package com.jchz.leetcode.simple.$0476_数字的补数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-20 15:47
 */
public class Solution {


    public int findComplement(int num) {
        int t = ~num;
        int count = 0;
        int res = 0;
        while ((num >>= 1) > 0) {
            res |= t & (1 << count);
            count++;
        }

        return res;
    }
}
