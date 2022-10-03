package com.jchz.leetcode.$0168_Excel表列名称;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-14 00:21
 */
public class Solution {
    public String convertToTitle(int columnNumber) {
        char base = 'A' - 1;
        StringBuilder sb = new StringBuilder();

        while (columnNumber != 0) {
            int mod = columnNumber % 26;
            columnNumber /= 26;
            if (mod == 0) {
                columnNumber--;
                mod = 26;
            }

            sb.append((char) (base + mod));
        }

        return sb.reverse().toString();
    }
}
