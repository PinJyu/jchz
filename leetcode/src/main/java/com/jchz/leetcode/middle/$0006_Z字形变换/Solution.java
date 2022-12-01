package com.jchz.leetcode.middle.$0006_Z字形变换;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-22 17:27
 */
public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        char[] cs = s.toCharArray();
        int z = numRows - 2 + numRows;
        StringBuilder sb = new StringBuilder();
        for (int  i = 0; i < numRows; i++) {
            for (int j = 0; j * z + i < cs.length; j++) {
                sb.append(cs[j * z + i]);
                if (i != 0 && i != numRows - 1 && j * z + z -i < cs.length) {
                    sb.append((char) (cs[j * z + z - i]));
                }
            }
        }

        return sb.toString();
    }
}
