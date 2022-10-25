package com.jchz.leetcode.simple.$LCS0002_完成一半题目;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-25 11:52
 */
public class Solution {
    public int halfQuestions(int[] questions) {
        int[] map = new int[1001];

        for (int i : questions) {
            map[i]++;
        }

        Arrays.sort(map);
        int n = questions.length / 2, count = 0;
        for (int i = map.length - 1; i >= 0; i--) {
            n -= map[i];
            count++;
            if (n <= 0)
                break;
        }

        return count;
    }

}
