package com.jchz.leetcode.simple.$0058_最后一个单词的长度;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-09 17:46
 */
public class Solution {

    public int lengthOfLastWord(String s) {
        int count = 0, backupCount = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                backupCount = Math.max(count, backupCount);
                count = 0;
            }
            else {
                backupCount = 0;
                count ++;
            }
        }
        return count == 0 ? backupCount : count;
    }

    // 反向遍历
    public int lengthOfLastWord_1(String s) {
        char[] cs = s.toCharArray();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (cs[i] == ' ') {
                if (count > 0) break;
                count = 0;
            }
            else {
                count++;
            }

        }
        return count;
    }
}
