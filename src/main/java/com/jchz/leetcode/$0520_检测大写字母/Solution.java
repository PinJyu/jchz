package com.jchz.leetcode.$0520_检测大写字母;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-21 16:05
 */
public class Solution {

    public static void main(String[] args) {
        new Solution().detectCapitalUse("mL");
    }
    public boolean detectCapitalUse(String word) {
        char c = word.charAt(0);
        boolean firstUpperCase = false;
        if (c >= 'A' && c <= 'Z')
            firstUpperCase = true;

        int count = 0;
        for (int i = 1; i < word.length(); i++) {
            c = word.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                count++;
            }

            if (count < i && count != 0) {
                return false;
            }
        }

        return firstUpperCase || count == 0;


    }
}
