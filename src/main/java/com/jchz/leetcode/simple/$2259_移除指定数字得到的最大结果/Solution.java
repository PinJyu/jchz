package com.jchz.leetcode.simple.$2259_移除指定数字得到的最大结果;


/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 17:35
 */
public class Solution {
    public java.lang.String removeDigit(String number, char digit) {
        char[] vs = number.toCharArray();
        StringBuilder sb = new StringBuilder();
        int index = -1;
        for (int i = 0; i + 1 < vs.length; i++) {
            if (vs[i] == digit) {
                index = i;
                if (vs[i] <= vs[i + 1]) {
                    break;
                }
            }
        }

        if (index > -1) {
            for (int i = 0; i < vs.length; i++) {
                if (i != index)
                    sb.append(vs[i]);
            }
            return sb.toString();
        }
        else {
            return number;
        }
    }
}
