package com.jchz.leetcode.simple.$剑指Offer0058_I_翻转单词顺序;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-20 15:12
 */
public class Solution {
    public String reverseWords(String s) {
        char[] cs = s.toCharArray();
        int l = 0, r = cs.length - 1;
        while (l < r) {
            char t = cs[l];
            cs[l] = cs[r];
            cs[r] = t;
            l++;
            r--;
        }

        StringBuilder sb = new StringBuilder();
        int beg = -1, end = -1;
        for (int i = 0; i < cs.length; i++) {
            if (beg == -1 && cs[i] != ' ') {
                beg = i;
                end = i;
            }
            else if (beg != -1 && cs[i] != ' ')
                end = i;
            else if (end != -1 && (cs[i] == ' ' || end == cs.length - 1)) {
                for (int j = end; j >= beg; j--) {
                    sb.append(cs[j]);
                }
                sb.append(' ');
                beg = -1;
                end = -1;
            }
        }

        if (beg != -1 && end != -1)
            for (int j = end; j >= beg; j--) {
                sb.append(cs[j]);
            }
        else if (sb.length() > 0){
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
