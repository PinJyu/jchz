package com.jchz.leetcode.$0202_快乐数;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-14 13:41
 */
public class Solution {
    public static void main(String[] args) {
        new Solution().isHappy(20);
    }
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (set.add(n)) {
            int reduce = 0;
            while (n > 0) {
                int mod = n % 10;
                reduce += mod * mod;
                n /= 10;
            }

            if (reduce == 1)
                return true;
            else {
                n = reduce;
            }
        }

        return false;
    }

    private int getNext(int n) {
        int reduce = 0;
        while (n > 0) {
            int mod = n % 10;
            reduce += mod * mod;
            n /= 10;
        }

        return reduce;
    }
    // 快慢指针，检测链表是否有环
    public boolean isHappy_1(int n) {
        int lower = n;
        int faster = getNext(n);
        while (faster != 1 && faster != lower) {
            lower = getNext(lower);
            faster = getNext(getNext(faster));
        }
        return faster == 1;
    }
}
