package com.jchz.leetcode.simple.$1154_一年中的第几天;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 21:16
 */
public class Solution {
    public static void main(String[] args) {
        new Solution().dayOfYear("2019-02-10");
    }
    public int dayOfYear(String date) {
        Integer year = Integer.valueOf(date.substring(0, 4));
        Integer month = Integer.valueOf(date.substring(5, 7));
        Integer day = Integer.valueOf(date.substring(8, 10));

        int sum = 0;
        for (int i = 1; i < month + 1; i++) {
            if (i == month) {
                sum += day;
            }
            else {
                int days = 0;
                switch (i) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12: {
                        days = 31;
                        break;
                    }
                    case 4:
                    case 6:
                    case 9:
                    case 11: {
                        days = 30;
                        break;
                    }
                    default: {
                        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                            days = 29;
                        }
                        else {
                            days = 28;
                        }
                    }
                }
                sum += days;
            }
        }

        return sum;
    }
}
