package com.jchz.leetcode.simple.$1837_K进制表示下的各位数字总和;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-10 22:14
 * @see
 * @since
 */
public class Solution {
    public int sumBase(int n, int k) {

        int sum = 0;
        while (n > 0) {
            sum += n % k;
            n /= k;
        }

        return sum;
    }
}
