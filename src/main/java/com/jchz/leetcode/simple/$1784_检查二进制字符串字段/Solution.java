package com.jchz.leetcode.simple.$1784_检查二进制字符串字段;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 18:11
 */
public class Solution {
    public boolean checkOnesSegment_1(String s) {
        return !s.contains("01");
    }
    public boolean checkOnesSegment(String s) {
        int freezeOne = -1, countOne = 0;
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == '0') {
                if (freezeOne == -1)
                    freezeOne = countOne;
            }
            else {
                countOne++;
            }
        }

        return freezeOne == -1 || freezeOne == countOne;
    }
}
