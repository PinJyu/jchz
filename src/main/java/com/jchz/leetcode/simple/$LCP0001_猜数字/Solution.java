package com.jchz.leetcode.simple.$LCP0001_猜数字;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-16 01:38
 * @see
 * @since
 */
public class Solution {
    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (guess[i] == answer[i])
                count++;
        }

        return count;
    }

}
