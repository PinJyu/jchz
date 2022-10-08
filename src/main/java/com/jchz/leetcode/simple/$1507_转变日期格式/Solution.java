package com.jchz.leetcode.simple.$1507_转变日期格式;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-08 18:01
 */
public class Solution {

    public String reformatDate(String date) {
        String[] s = date.split(" ");
        String day = s[0].substring(0, s[0].length() > 3 ? 2 : 1);
        day = day.length() > 1 ? day : "0" + day;
        String month = null;
        String[] months = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (int i = 0; i < months.length; i++) {
            if (s[1].equals(months[i])) {
                month = i + 1 + "";
                month = month.length() > 1 ? month : "0" + month;
            }

        }

        return s[2] + "-" + month + "-" + day;
    }
}
