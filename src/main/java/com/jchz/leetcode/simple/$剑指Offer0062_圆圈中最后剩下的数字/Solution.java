package com.jchz.leetcode.simple.$剑指Offer0062_圆圈中最后剩下的数字;

import java.util.LinkedList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-20 16:28
 */
public class Solution {
    public int lastRemaining(int n, int m) {
        int l = 0;
        for (int i = 2; i <= n; i++) {
            l = (m + l) % i;
        }

        return l;
    }
    public int lastRemaining_2(int n, int m) {
        if (n == 1)
            return 0;

        int j = lastRemaining(n - 1, m);
        return (m + j) % (n);
    }


    // timeout
    public int lastRemaining_1(int n, int m) {
        List<Integer> li = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            li.add(i);
        }

        int index = 0;
        for (int i = 0; i + 1 < n; i++) {
            index = (index + m - 1) % li.size();
            li.remove(index);
        }

        return li.get(0);
    }
}
