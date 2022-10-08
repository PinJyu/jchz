package com.jchz.leetcode.simple.$0942_增减字符串匹配;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-03 20:21
 */
public class Solution {
    public int[] diStringMatch(String s) {
        int l = 0, h = s.length();
        int[] res = new int[s.length() + 1];

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (c == 'I') {
                res[i] = l;
                l++;
            }
            else {
                res[i] = h;
                h--;
            }
        }

        res[res.length - 1] = l;
        return res;
    }
}
