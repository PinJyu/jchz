package com.jchz.leetcode.simple.$1880_检查某单词是否等于两单词之和;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 15:33
 */
public class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {



        return toInt(firstWord) + toInt(secondWord) == toInt(targetWord);
    }

    int toInt(String word) {
        char[] cs = word.toCharArray();
        int sum = 0;
        for (int i = cs.length - 1; i >= 0; i--) {
            sum += (cs[i] - 'a') * Math.pow(10, (cs.length - 1) - i);
        }

        return sum;
    }
}
