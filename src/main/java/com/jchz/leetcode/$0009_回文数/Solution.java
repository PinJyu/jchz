package com.jchz.leetcode.$0009_回文数;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-02 14:16
 */
public class Solution {

    // 2n
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;

        Deque<Integer> q = new LinkedList<>();

        while (x != 0) {
           int mod = x % 10;
           q.addLast(mod);
           x /= 10;
        }

        while (!q.isEmpty()) {
            Integer part1 = q.pollFirst();
            Integer part2 = q.pollLast();
            if (part2 != null && !part1.equals(part2)) {
                return false;
            }
        }

        return true;
    }

    // n, 反转一半 1221 -> 12 == 12
    public boolean isPalindrome2(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        if (x % 10 == 0) return false;


        int xbar = 0;
        while (x != 0) {
            int xori = x; // even 12321 -> 123 == 123
            int mod = x % 10;
            x /= 10;

            xbar += mod;
            if (x == xbar || xori == xbar)
                return true;

            xbar *= 10;
        }


        return true;
    }

    // n 全反转
    public boolean isPalindrome3(int x) {
        if (x < 0) {
            return false;
        }
        int xx = x;
        int y = 0;
        while (xx > 0) {
            y = y*10 + xx % 10;
            xx  /= 10;
        }

        return x == y;
    }
}
