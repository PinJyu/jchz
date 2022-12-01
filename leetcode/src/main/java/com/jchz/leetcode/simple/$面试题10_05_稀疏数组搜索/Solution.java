package com.jchz.leetcode.simple.$面试题10_05_稀疏数组搜索;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-24 10:34
 */
public class Solution {

    public int findString(String[] words, String s) {
        int l = 0, r = words.length - 1, ans = -1;

        while (l <= r) {
            int m = (r + l) / 2;
            String mw = words[m];
            while ("".equals(mw) && m < r) {
                mw = words[++m % words.length];
            }

            if ("".equals(mw)) {
                r = (r + l) / 2 - 1;
                continue;
            }

            int d = mw.compareTo(s);

            if (d == 0) {
                ans = m;
                break;
            }
            else if (d > 0) {
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }


        return ans;
   }

}
