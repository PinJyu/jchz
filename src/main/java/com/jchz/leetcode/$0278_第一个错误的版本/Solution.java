package com.jchz.leetcode.$0278_第一个错误的版本;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-16 11:29
 */
public class Solution {
    public int firstBadVersion(int n) {
        int l = 1, r = n, mid = 0;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (isBadVersion(mid)) {
                r = mid;
            }
            else {
                l = mid + 1;
            }
        }
        return mid;
    }

    private boolean isBadVersion(int version) {
        return System.currentTimeMillis() % 2 == 0;
    }
}
