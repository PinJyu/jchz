package com.jchz.leetcode.simple.$1281_整数的各位积和之差;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 19:06
 */
public class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int mode = n % 10;
            n /= 10;
            sum += mode;
            product *= mode;
        }

        return product - sum;
    }
}
