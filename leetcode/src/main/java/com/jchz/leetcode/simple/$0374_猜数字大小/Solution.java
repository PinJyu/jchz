package com.jchz.leetcode.simple.$0374_猜数字大小;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-19 15:57
 */
public class Solution {
    public int guessNumber(int n) {
        int l = 1, r = n;

        while (l <= r) {
            int mid = (l + r) / 2;
            int guess = guess(mid);
            if (guess == 0) {
                return mid;
            }
            else if (guess == 1) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return -1;
    }

    int guess(int num) {
        return System.currentTimeMillis() % 2 == 0 ? -1 : 1;
    }
}
