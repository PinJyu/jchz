package com.jchz.leetcode.simple.$面试题16_15_珠玑妙算;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-24 16:04
 */
public class Solution {
    public int[] masterMind(String solution, String guess) {
        char[] cs1 = solution.toCharArray();
        char[] cs2 = guess.toCharArray();

        int bingo = 0, dummyBingo = 0;
        for (int i = 0; i < cs1.length; i++) {
            if (cs1[i] == cs2[i]) {
                bingo++;
                cs1[i] = 'a';
                cs2[i] = 'b';
            }
        }

        for (int i = 0; i < cs1.length; i++) {
            for (int j = 0; j < cs2.length; j++) {
                if (cs1[i] == cs2[j]) {
                    dummyBingo++;
                    cs1[i] = 'a';
                    cs2[j] = 'b';
                }
            }
        }

        return new int[] {bingo, dummyBingo};
    }
}
