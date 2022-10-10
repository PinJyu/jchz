package com.jchz.leetcode.simple.$1694_重新格式化电话号码;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 12:09
 */
public class Solution {
    public String reformatNumber(String number) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : number.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
                sb.append(c);
                if (count % 3 == 0)
                    sb.append('-');
            }
        }
        int mode = count % 3;
        if (mode == 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        else if (mode == 1) {
            char c = sb.charAt(sb.length() - 3);
            sb.setCharAt(sb.length() - 3, '-');
            sb.setCharAt(sb.length() - 2, c);
        }

        return sb.toString();
    }

}
