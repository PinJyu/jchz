package com.jchz.leetcode.$0744_寻找比目标字母大的最小字母;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-28 15:19
 */
public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, r = letters.length - 1;
        if (letters[r] >= target) return letters[0];

        while (l < r) {
            int mid = (l + r) / 2;

            if (letters[mid] > target) {
                r = mid;
            }
            else {
                l = mid + 1;
            }
        }

        return letters[r];
    }
}
