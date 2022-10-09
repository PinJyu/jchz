package com.jchz.leetcode.simple.$1588_所有奇数长度子数组的和;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-09 15:41
 */
public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            update(i + 1, arr[i]);
        }

        int sum = 0;
        for (int i = 1; i <= arr.length; i += 2) {
            for (int j = 0; j + i - 1 < arr.length; j++) {
                sum += sum(j + i) - sum(j);
            }
        }

        return sum;
    }


    int[] ta = new int[102];
    void update(int i, int v) {
        for (; i < ta.length; i += i & (-i)) {
            ta[i] += v;
        }
    }

    int sum(int i) {
        int r = 0;
        for (; i > 0; i -= i & (-i)) {
            r += ta[i];
        }
        return r;
    }


}
