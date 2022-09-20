package com.jchz.leetcode.$0441_排列硬币;

import java.sql.SQLOutput;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-20 11:20
 */
public class Solution {
    public static void main(String[] args) {
        new Solution().arrangeCoins(2147483647);
    }
    public int arrangeCoins(int n) {
        final int l = n;
        for (int i = 1; i < l; i++) {
            n -= i;
            if (n == 0)
                return i;
            else if (n < 0)
                return i - 1;
        }

        return 0;
    }
}
