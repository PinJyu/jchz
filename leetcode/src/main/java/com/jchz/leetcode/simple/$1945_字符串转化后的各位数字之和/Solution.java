package com.jchz.leetcode.simple.$1945_字符串转化后的各位数字之和;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 17:49
 */
public class Solution {
    public int getLucky(String s, int k) {
        char[] cs = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < cs.length; i++) {
            sum += getRadixSum(cs[i] - 'a' + 1);

        }

        for (int i = 0; i < k - 1; i++) {
            sum = getRadixSum(sum);
        }

        return sum;
    }

    int getRadixSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
