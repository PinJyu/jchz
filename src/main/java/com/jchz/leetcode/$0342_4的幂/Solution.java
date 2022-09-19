package com.jchz.leetcode.$0342_4的幂;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-16 16:07
 */
public class Solution {
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & -n) != n && (0xaaaa_aaaa & n) > 0;
    }
}
