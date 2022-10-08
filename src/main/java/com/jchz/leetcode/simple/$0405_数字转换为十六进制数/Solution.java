package com.jchz.leetcode.simple.$0405_数字转换为十六进制数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-19 18:03
 */
public class Solution {
    public String toHex(int num) {
        String res = "";
        final int mask = 0xf;
        for (int i = 7; i >= 0; i--) {
            int j = num >>> (4 * i) & mask;
            System.out.println(j);
            if ("".equals(res) && j == 0) {
            }
            else if (j < 10) {
                res += j;
            }
            else {
                res += String.valueOf((char) ('a' + (j - 10)));
            }

        }


        return "".equals(res) ? "0" : res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().toHex(26));
    }

}
